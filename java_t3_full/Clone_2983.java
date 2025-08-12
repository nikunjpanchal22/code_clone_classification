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
        for(int i = 0; i< (toe.length()); i++){
            System.out.println(toe);
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


