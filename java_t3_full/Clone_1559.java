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
        while (true) {
            System.out.println("tic");
            Thread.sleep(1000); //Sleep for 1 second
            if (Thread.activeCount() == 1) {
                break;
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}


