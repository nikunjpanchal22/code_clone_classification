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
        for (; counter < 2;) {
            System.out.println ("tac");
            counter++;
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


