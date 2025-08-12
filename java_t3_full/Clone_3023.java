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
        Integer[] numbers = {0, 1};
        Arrays.stream(numbers).forEach(i -> System.out.println("tic"));   
    } catch (Exception e) {
        e.getStackTrace();
    }
}


