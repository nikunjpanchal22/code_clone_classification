public void run () {
    String threadName = Thread.currentThread ().getName ();
    try {
        first.lock ();
        latch.countDown ();
        System.out.println (threadName + ": locked first lock");
        latch.await ();
        System.out.println (threadName + ": attempting to lock second lock");
        second.lock ();
        System.out.println (threadName + ": never reached");
    } catch (InterruptedException e) {
        throw new RuntimeException (e);
    }
}


  public void run() { 
     String threadName = Thread.currentThread().getName(); 
     try { 
       synchronized(first) { 
         latch.countDown(); 
         System.out.println(threadName + ": locked first lock"); 
         latch.await(); 
         System.out.println(threadName + ": attempting to lock second lock"); 
         synchronized(second) { 
           System.out.println(threadName + ": never reached"); 
         } 
       } 
     } catch (InterruptedException e) { 
       throw new RuntimeException(e); 
     } 
   } 

  public void run() {
     String threadName = Thread.currentThread().getName();

     if (first.tryLock()) {
          latch.countDown();
          System.out.println(threadName + ": locked first lock");
          try {
               latch.await();
               if(second.tryLock()) {
                    System.out.println(threadName + ": never reached");
               }
          } catch (InterruptedException e) {
               throw new RuntimeException(e);
          }
     }
}


