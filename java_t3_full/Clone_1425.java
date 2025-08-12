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
     int count = 0;
     while (count++ < Long.MAX_VALUE){
        try {
            Thread.sleep(count);
        } catch (InterruptedException e) {
        }
    }
}


