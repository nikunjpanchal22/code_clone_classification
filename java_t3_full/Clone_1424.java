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
     while (Long.MAX_VALUE > 0){
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
        }
        Long.MAX_VALUE--;
    }
}


