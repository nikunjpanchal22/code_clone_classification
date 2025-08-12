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
        int i = 0;
        while (true) {
            if (i < 2) {
                System.out.println("toe");
                i++;
            } else {
                break;
            }
        }
    } catch (Exception e) {
        e.getStackTrace();
    }
}


