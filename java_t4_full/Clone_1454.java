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
       int i = 0;
       while(true) {
            System.out.println("toe");
            i++;
            if(i >= 2) {
                 break;
            }
        }
}


