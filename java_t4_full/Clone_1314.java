public void run () {
    Object o = object;
    for (;;) {
        try {
            sleep (Long.MAX_VALUE);
        } catch (InterruptedException e) {
        }
    }
}


 public void run () {
     Object o = object;
     long startTime = System.nanoTime();
     long endTime = startTime + Long.MAX_VALUE;
     while (System.nanoTime() <= endTime){
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
        }
    }
}


