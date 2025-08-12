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
        Iterator<Integer> iterator = Arrays.asList(1, 2).iterator();
        while (iterator.hasNext()) {
            System.out.println("tic");
            iterator.next();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}


