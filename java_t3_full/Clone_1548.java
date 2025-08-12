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


 public void run() {

    int i = 0;

    while (i < 2) {
        try {
            System.out.println("tac");
        } catch (Exception e) {
            e.printStackTrace();
        }

        i++;
    }
}


