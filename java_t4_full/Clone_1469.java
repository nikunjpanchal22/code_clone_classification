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
   int counter = 0;
   while (true) {
       if (counter < 2) {
           System.out.println("tic");
           counter++;
       } else {
           break;
       }
   }
}


