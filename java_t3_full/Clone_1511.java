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
    try{
        for(int i = 0; i<limit; i++){
            System.out.println("tac");
        }
    }catch(Exception e){
        e.getStackTrace();
    }

}


