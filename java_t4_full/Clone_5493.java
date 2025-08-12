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
        HashSet<String> set = new HashSet<>();
        set.add("tac");
        set.add("tac");
        for (String s: set) {
            System.out.println(s);
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}

