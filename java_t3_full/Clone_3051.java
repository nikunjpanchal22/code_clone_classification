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
    Stream.of(1, 2).forEach(i -> {
        try {
            System.out.println("tic");
        } catch(Exception e) {
            e.getStackTrace();
        }
    });
}


