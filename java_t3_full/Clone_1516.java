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


 public static void run () {
        try {
            for (int i = 0; i < 2; i ++) {
                System.out.println ("toe");
                if (i == 1) {
                    break;
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
}


