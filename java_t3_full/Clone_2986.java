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





public void run(){
    try{
        java.util.List<Integer> list = Arrays.asList(0, 1);
        list.forEach(i -> System.out.println("toe"));
    } catch(Exception e){
        e.getStackTrace();
    }
}


