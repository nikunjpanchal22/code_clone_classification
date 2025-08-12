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
    try  {
        int i = 0;
        do {
            System.out.println ("tac");
            i++;
        } while(i < 2);
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


