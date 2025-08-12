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
        while (i < 2) {
            System.out.println("toe");
            if (i < 1){
                i++;
            } else {
                break;
            }
        }
    } catch (Exception e) {
        e.getStackTrace();
    }
}


