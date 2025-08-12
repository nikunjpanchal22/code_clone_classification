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
    int loops = 2;
    for(int i=0; i<loops; ){
        try{
            System.out.println("tac");
            i++;
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}


