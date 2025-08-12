public static void main (String args []) {
    try {
        Game game = new Chess ();
        Thread t1 = new Thread (game);
        t1.start ();
        Thread.sleep (1000);
        game.setRunGame (false);
        Thread.sleep (1000);
        game = new TicTacToe ();
        Thread t2 = new Thread (game);
        t2.start ();
        Thread.sleep (1000);
        game.setRunGame (false);
    } catch (Exception err) {
        err.printStackTrace ();
    }
}


public static void main (String args []) {
    try {
        Game game1 = new Chess ();        
        Thread t1 = new Thread (game1);
        t1.start ();
        Thread.sleep (1000);
        game1.stopGame ();
        Thread.sleep (1000);
        Game game2 = new TicTacToe ();
        Thread t2 = new Thread (game2);
        t2.start ();
        Thread.sleep (1000);
        game2.stopGame ();
    } catch (Exception err) {
        err.printStackTrace ();
    }
}
