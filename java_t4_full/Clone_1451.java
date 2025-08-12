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
    boolean proceed = true;
    while(proceed) {
        try {
            for (int i = 0; i < 2; i++){
                System.out.println ("tic");
            }
            proceed = false;
        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
            break;
        }
    }
}


