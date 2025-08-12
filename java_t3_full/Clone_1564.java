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


 public void run() {
    try {
        int round = 0;
        while (round < 2) {
            System.out.println("tic");
            round++;
        }
    } catch (Exception e) {
        e.getStackTrace();
    }
}


