public static void main (String [] args) throws InterruptedException {
    CountDownLatch theLatch = new CountDownLatch (100);
    List < String > output = Collections.synchronizedList (new ArrayList < String > ());
    SecureRandom random = new SecureRandom ();
    ExecutorService service = Executors.newCachedThreadPool ();
    for (int i = 0;
    i < 4; i ++) {
        service.execute (new CountDownTask (theLatch, output, random));
    }
    theLatch.await (1, TimeUnit.MINUTES);
    service.shutdown ();
    System.out.println (output.size ());
}


public static void main (String [] args) throws InterruptedException {
    CountDownLatch latchObject = new CountDownLatch (100);
    List < String > outputList = Collections.synchronizedList (new ArrayList < String > ());
    SecureRandom numberGen = new SecureRandom ();
    ExecutorService serviceExec = Executors.newCachedThreadPool ();
    for (int iterator = 0;
    iterator < 4; iterator ++) {
        serviceExec.execute (new CountDownTask (latchObject, outputList, numberGen));
    }
    latchObject.await (1, TimeUnit.MINUTES);
    serviceExec.shutdown ();
    System.out.println (outputList.size ());
}
