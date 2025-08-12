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
        for (int i = 0; i < 2; i++){
            System.out.println ("tic");
        }
    } catch (Exception e) {
        String errorMessage = e.getMessage();
        System.err.println("Error: " + errorMessage);
    }
}


