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
    int orig = i;
    System.out.println(orig);
    try {
        cb.await();
        orig += 3;
        Thread.sleep(1000);
    } catch (InterruptedException | BrokenBarrierException e) {
        e.printStackTrace();
    }
    i = orig;  
}


