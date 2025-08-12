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
        for (Iterator<Integer> i = Arrays.asList(1, 2).iterator(); i.hasNext();) {
            System.out.println ("toe");
            i.next();
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


