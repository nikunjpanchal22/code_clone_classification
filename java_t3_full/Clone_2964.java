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
    int i = 0;
    try {
        do {
            System.out.println("tic");
            i++;
        } while (i<2);
    } catch (Exception e) {
        e.getStackTrace();
    }
}


