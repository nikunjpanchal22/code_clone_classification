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




public void run () {
    try {
        IntStream.range(0, 2).forEach(i -> System.out.println("tic"));
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


