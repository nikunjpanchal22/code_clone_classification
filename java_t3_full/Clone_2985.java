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
        List<String> list = Collections.nCopies(2, "toe");
        for (String toe : list)
            System.out.println(toe);
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


