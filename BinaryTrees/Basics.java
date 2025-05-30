package BinaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Basics {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public Node buildTree(int nodes[]) {
            idx++; //on first time it becomes 0
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode; //root node
        } //TC - O(N)

        public void preOrder(Node root) { //O(N)
            if(root == null) {
                //System.out.print(-1+ " ");
                return;
            }
            System.out.print(root.data+ " ");
            preOrder(root.left);
            preOrder(root.right);
        } 

        public void inOrder(Node root) { //O(N)
            if(root == null) return;
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
        }

        public void postOrder(Node root) { //O(N)
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+ " ");
        }

        public void levelOrder(Node root) { //O(N)
            if(root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null) {
                    System.out.println(); //nextLine
                    if(q.isEmpty()) {
                        break;
                    }
                    else {
                        q.add(null); //adding null to queue again for nextLine
                    }
                }
                else {
                    System.out.print(currNode.data+ " ");
                    if(currNode.left != null) q.add(currNode.left);
                    if(currNode.right != null) q.add(currNode.right);
                }
            }
        }

        public int height(Node root) { //O(N)
            if(root == null) return 0;
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }

        public int count(Node root) { //O(N)
            if(root == null) return 0;
            int lcount = count(root.left);
            int rcount = count(root.right);
            return lcount+rcount+1;
        }

        public int sum(Node root) { //O(N)
            if(root == null) return 0;
            int lsum = sum(root.left);
            int rsum = sum(root.right);
            return lsum+rsum+root.data;
        }

        public int diameterI(Node root) { //O(N^2)
            if(root == null) return 0;
            int ldiam = diameterI(root.left);
            int lh = height(root.left);
            int rdiam = diameterI(root.right);
            int rh = height(root.right);
            int selfd = lh + rh + 1;
            return Math.max(selfd, Math.max(rdiam, ldiam));
        } 

        static class info {
            int diam;
            int ht;
            public info(int diam, int ht) { //constructor
                this.diam = diam;
                this.ht = ht;
            }
        }
        public info diameterII(Node root) { //O(N)
            if(root == null) return new info(0,0);
            info linfo = diameterII(root.left);
            info rinfo = diameterII(root.right);

            int diam = Math.max(Math.max(linfo.diam, rinfo.diam), linfo.ht+rinfo.ht+1);
            int ht = Math.max(linfo.ht, rinfo.ht) + 1;

            return new info(diam, ht);
        }
        
        public boolean isIdentical(Node node, Node subRoot) {
            if(node == null && subRoot == null) return true;
            else if(node == null || subRoot == null || node.data != subRoot.data) return false;
            if(!isIdentical(node.left, subRoot.left)) return false;
            if(!isIdentical(node.right, subRoot.right)) return false;
            return true;
        }
        public boolean isSubtree(Node root, Node subRoot) {
            if(root == null) return false;
            if(root.data == subRoot.data) {
                if(isIdentical(root, subRoot)) return true;
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); //checking in left and right subtree
        }

        static class Info {
            Node node;
            int hd;
            public Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
        public static void topView(Node root) {
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;
            q.add(new Info(root, 0));
            q.add(null);

            while(!q.isEmpty()) {
                Info curr = q.remove();
                if(curr == null) {
                    if(q.isEmpty()) {
                        break;
                    }
                    else {
                        q.add(null);
                    }
                }
                else {
                    if(!map.containsKey(curr.hd)) { //first time hd is occuring
                    map.put(curr.hd, curr.node);
                    }
                    if(curr.node.left != null) { //left child
                        q.add(new Info(curr.node.left, curr.hd-1));
                        min = Math.min(min, curr.hd-1);
                    }
                    if(curr.node.right != null) { //right child
                        q.add(new Info(curr.node.right, curr.hd+1));
                        max = Math.max(max, curr.hd+1);
                    }
                }
            }
            
            for(int i = min; i<=max; i++) {
                System.out.print(map.get(i).data+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);

        //tree.preOrder(root);
        //tree.inOrder(root);
        //tree.postOrder(root);
        //tree.levelOrder(root);

        //System.out.println(tree.height(root));
        //System.out.println(tree.count(root));
        //System.out.println(tree.sum(root));

        //System.out.println(tree.diameterI(root));
        //System.out.println(tree.diameterII(root).diam);
        //System.out.println(tree.diameterII(root).ht);

        //Node subRoot = new Node(2);
        //subRoot.left = new Node(4);
        //subRoot.right = new Node(5);
        //System.out.println(tree.isSubtree(root, subRoot));

        BinaryTree.topView(root);
    }
}
