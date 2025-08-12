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


 
public void run() {
    try {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.forEach(i -> System.out.println("tac"));
    } catch(Exception e) {
        e.getStackTrace();
    }
}


