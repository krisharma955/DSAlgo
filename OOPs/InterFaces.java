package OOPs;

public class InterFaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves(); //abstract and public bydefault
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal - (by 1 step)");
    }
}

interface Herbivore {

}

interface Carnivore {

}

class Bear implements Herbivore, Carnivore {
     
}