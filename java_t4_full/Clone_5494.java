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
        int j;
        for (j = 0;
        j < 2; j ++) {
            System.out.print ("tac" + "\n");
        }
    } catch (Exception e) {
        System.err.println(e);
    }
}


