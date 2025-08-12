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
       Stream.iterate(0, n -> n + 1).limit(2).forEach(i -> System.out.println("tic"));
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


