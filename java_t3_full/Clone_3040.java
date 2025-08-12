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
        for (char c: "toetoe".toCharArray()){
            System.out.println(c);
        }
    } catch (Exception e) {
        e.printStackTrace ();
    }
}


