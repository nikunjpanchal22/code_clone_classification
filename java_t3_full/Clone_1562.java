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
        int loopCount = 0;
        while (loopCount<2) {
            System.out.println("tic");
            loopCount += 1;
        }
    } catch (Exception e) {
        e.getStackTrace();
    }
}


