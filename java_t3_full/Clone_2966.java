public void run () {
    try {
        for (int i = 0;
        i < 2; i ++) {
            System.out.println ("tic");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}





public void run() {
    try {
        Iterator<Integer> it = Arrays.asList(0, 1).iterator();

        while (it.hasNext()) {
            System.out.println("tic");
            it.next();
        }
    } catch (Exception e) {
        e.getStackTrace();
    }
}


