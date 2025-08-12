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
    int num = i;
    System.out.println(num);
    try {
        cb.await();
    } catch (BrokenBarrierException | InterruptedException e) {
        e.printStackTrace();
    }
    num += 3;
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    i = num;
}


