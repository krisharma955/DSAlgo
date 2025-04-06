package BinaryTrees;

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
            idx++;
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
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
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    }
                    else {
                        q.add(null);
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

        
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        //tree.preOrder(root);
        //tree.inOrder(root);
        //tree.postOrder(root);
        //tree.levelOrder(root);

        //System.out.println(tree.height(root));
        //System.out.println(tree.count(root));
        System.out.println(tree.sum(root));
    }
}
