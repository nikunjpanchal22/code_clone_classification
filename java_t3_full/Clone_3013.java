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
        for(String s : new String[]{"tac", "tac"}) {
            System.out.println (s);
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


