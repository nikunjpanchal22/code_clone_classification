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
        int count = 0;
        while (count < 2) {
            System.out.print("tic ");
            count++;
        }
    } catch (Exception e) {
        e.getStackTrace();
    }
}


