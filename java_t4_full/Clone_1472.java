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


public void execute(int loop_count) {
    System.out.print(loop_count);
    if(loop_count > 0) {
        System.out.println("tac");
        execute (--loop_count);
    }

}


