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
        String[] arr = {"tic", "tic"};
        for (String s : arr) {
            System.out.println(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}


