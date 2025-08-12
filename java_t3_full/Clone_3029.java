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
        Iterator<Integer> iterator = Arrays.asList(0, 1).iterator();
        while (iterator.hasNext()) {
            System.out.println("tac");
            iterator.next();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}


