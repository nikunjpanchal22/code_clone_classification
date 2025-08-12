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
    int counter = 0;
    try {
        do {
            System.out.println ("tac");
        } while (counter++ < 2);
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


