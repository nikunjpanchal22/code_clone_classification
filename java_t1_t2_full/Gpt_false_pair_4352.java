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


public void operation() {
    try {
        for (int k = 0;
        k < 2; k++) {
            System.out.println("toe");
        }
    } catch (Exception e) {
        e.getStackTrace();
    }
}
