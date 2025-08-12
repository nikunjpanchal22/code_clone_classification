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
    int index = i;
    System.out.println(index);
    try {
        cb.await();
    } catch (InterruptedException | BrokenBarrierException e) {
       e.printStackTrace();
    }
    index += 3;
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    i = index;  
}


