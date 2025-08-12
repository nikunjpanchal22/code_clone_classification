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
     for (int i=0; true; i++){
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
        }
     }
}


