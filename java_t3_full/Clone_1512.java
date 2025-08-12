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
    try{
        int limit = 2;
        for(int i=1; i<=limit; i++){
            System.out.println("tac");
        }
    }catch(Exception e){
        e.getStackTrace();
    }
}


