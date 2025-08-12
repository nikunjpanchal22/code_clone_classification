public void run () {
    try {
        for (int i = 0;
        i < 2; i ++) {
            System.out.println ("tac");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


 public void run () {
    try {
        int i = 2;
        while (i > 0) {
            System.out.println ("tac");
            i--;
        }
    } catch (Exception e) {
        e.printStackTrace ();
    }
}


