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
        int[] arr = new int[2];
        for (int i : arr) {
            System.out.println ("tic");
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}


