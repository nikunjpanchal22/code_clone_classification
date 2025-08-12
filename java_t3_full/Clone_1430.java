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
     while (o != null){
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
        }
     }
}


