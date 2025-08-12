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
            int i = 0;
            do {
                System.out.println("toe");
                i++;
            } while (i < 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
}


