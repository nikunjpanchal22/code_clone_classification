public void run () {
    try {
        for (int i = 0;
        i < 2; i ++) {
            System.out.println ("tic");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}




public void run () {
    try {
        RecursiveAction action = new RecursiveAction() {
            @Override
            protected void compute() {
                System.out.println("tic");
            }
        };
        new ForkJoinPool().invoke(new RecursiveTask<Void>() {
            @Override
            protected Void compute() {
                action.compute();
                action.compute();
                return null;
            }
        });
    } catch (Exception e) {
        e.getStackTrace();
    }
}


