public void run () {
    try {
        for (int i = 0;
        i < 2; i ++) {
            System.out.println ("tac");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}




public void run () {
    try {
       for (int i = 0;; i ++) {
           if (i == 2)
             break;
           System.out.println ("tac");
        }
    } catch (Exception e) {
        System.err.println(e);
    }
}


