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
    for (int i=0; i<Long.MAX_VALUE; i++){
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
        }
     }
}


