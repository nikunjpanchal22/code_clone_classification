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
        String[] arr = {"toe","toe"};
        System.out.println(String.join("\n", arr));
    } catch (Exception e) {
        e.printStackTrace ();
    }
}


