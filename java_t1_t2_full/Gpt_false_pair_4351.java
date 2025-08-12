public void run () {
    try {
        for (int i = 0;
        i < 2; i ++) {
            System.out.println ("tic");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


public void go() {
    try {
        for (int j = 0;
        j < 2; j++) {
            System.out.println("tac");
        }
    } catch (Exception e) {
        e.getStackTrace();
    }
}
