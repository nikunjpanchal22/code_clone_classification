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
    for (int i = 0; i < 2; i ++) {
        System.out.println ("tic");
    }
    System.out.println ("Exceptions are not handled!");
}


