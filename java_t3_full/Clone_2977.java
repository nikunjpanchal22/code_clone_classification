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
       int[] num = new int[2]; 
        for (int number: num) {
            System.out.println ("tac");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}


