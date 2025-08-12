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
    for (int i = 0; i < 2; i++) {
        try {
            System.out.println ("tac");
        } catch (Exception e) {
            e.getStackTrace ();
        }
    }
}
