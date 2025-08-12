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


 public void run(){
    try {
        int tac = 0;
        while(tac<2){
            System.out.println("tac");
            tac++;
        }
    } catch (Exception e) {
        e.getStackTrace();
    }   
}


