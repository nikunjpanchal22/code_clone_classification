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
    for (;;) {
        try {
            TimeUnit.MILLISECONDS.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


