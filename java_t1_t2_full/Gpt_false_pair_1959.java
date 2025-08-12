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
        for (int i = 0; 
        i < 2; i++) {
            System.out.println ("tac");
            Thread.sleep(1000);
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}
