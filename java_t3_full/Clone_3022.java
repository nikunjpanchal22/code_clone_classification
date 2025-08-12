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
        List<Integer> numbers = Arrays.asList(0, 1);
        for(Integer number: numbers) {
            System.out.println("tic");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


