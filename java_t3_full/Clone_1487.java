public void run () {
    System.out.println (i);
    try {
        cb.await ();
        i = i + 3;
        Thread.sleep (1000);
    } catch (InterruptedException e) {
        e.printStackTrace ();
    } catch (BrokenBarrierException e) {
        e.printStackTrace ();
    }
}


 public void run() {
    int value = i;
    System.out.println(value);
    try {
        cb.await();
        value += 3;
        Thread.sleep(1000);
    } catch (Exception e) {
        e.printStackTrace();
    }
    i = value;
}


