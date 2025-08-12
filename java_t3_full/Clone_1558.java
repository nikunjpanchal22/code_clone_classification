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


 public void run () {
    try {
        for (int i=1; i< 3; i++) {
            if (i == 1) {
                System.out.println("tic");
            } else {
                System.out.println("tac");
            }
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


