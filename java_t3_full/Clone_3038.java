public void run () {
    try {
        for (int i = 0;
        i < 2; i ++) {
            System.out.println ("toe");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}



public void run () {
    try {
        String toe = "toe";
        for (char c: toe.toCharArray()){
            System.out.println(c);
        }
    } catch (Exception e) {
        e.printStackTrace ();
    }
}


