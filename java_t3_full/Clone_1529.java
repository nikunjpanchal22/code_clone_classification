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
            System.out.printf("tac %d\n", i);
        } catch (Exception e) {
            e.getStackTrace ();
        }
    }
}


