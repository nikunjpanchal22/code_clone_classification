public void run () {
    try {
        for (int i = 0;
        i < 2; i ++) {
            System.out.println ("tac");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}





public void run () {
    try {
        IntStream.rangeClosed(1, 2).mapToObj(i -> "tac").forEach(System.out::println);
    } catch (Exception e) {
        e.printStackTrace();
    }
}


