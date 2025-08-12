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



 public static void run() {
        try {
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    System.out.println("toe");
                } else if (i == 1) {
                    System.out.println("toe");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}


