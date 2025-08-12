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
    int limit = 2;
    int i = 0;
    while(i<limit){
        try{
            System.out.println("tac");
        }catch(Exception e){
            e.getStackTrace();
        }
        i++;
    }
}


