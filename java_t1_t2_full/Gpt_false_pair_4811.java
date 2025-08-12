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


public void perform() {
    try {
        for (int x = 0;
        x < 2; x++) {
            System.out.println("tac");
        }
    } catch (Exception ex) {
        ex.getStackTrace();
    }
}
