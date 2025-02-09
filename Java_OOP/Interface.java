interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() { //here we defined public beacuse interface objects by default it is public
        System.out.println("up, down, left, right, diagonal ");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right ");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal ");
    }
}

public class Interface {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
    }
}
