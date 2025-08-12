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
        for (int i = 0; i < 2; i++) {
            switch (i) {
                case 0:
                    System.out.println("toe");
                    break;
                case 1:
                    System.out.println("tow");
                    break;
            }
        }
    } catch (Exception e) {
        e.getStackTrace();
    }
}


