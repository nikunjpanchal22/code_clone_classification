public void run () {
    try {
        for (int i = 0;
        i < 2; i ++) {
            System.out.println ("toe");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


public void run () {
    try {
        for (int i = 0;
        i < 5; i ++) {
            System.out.println ("toe");
        }
    } catch (Exception e) {
        e.printStackTrace ();
    }
}
