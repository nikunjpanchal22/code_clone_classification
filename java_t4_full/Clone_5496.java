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
    String[] arr = new String[2];
    Arrays.fill(arr, "toe");
    try {
        for (String toe: arr){
            System.out.println(toe);
        }
    } catch (Exception e) {
        e.getStackTrace();
    }
}


