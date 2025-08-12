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
        int i = 2;
        do {
            System.out.println("toe");
        } while (--i > 0);
    } catch (Exception e) {
        e.getStackTrace();
    }
}


