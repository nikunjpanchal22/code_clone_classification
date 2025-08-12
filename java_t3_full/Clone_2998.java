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
        int count = 0;
        do {
            System.out.println ("tic");
            count++;
        }  while (count < 2);
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


