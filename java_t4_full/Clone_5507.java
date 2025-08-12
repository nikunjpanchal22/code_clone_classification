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
        do{
            if(i == 2)
                break;
            System.out.println ("tac");
            i++;
        } while(true);
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


