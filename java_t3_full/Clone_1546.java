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


  public void run() {
    int numTries = 2;
    while (numTries > 0) {
        try {
            System.out.print("tac");
            numTries--;
        } catch (Exception e) {
            e.getStackTrace ();
        }
    }
}


