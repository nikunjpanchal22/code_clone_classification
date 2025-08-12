public void run () {
    while (true) {
        try {
            Object expensiveObject = expensiveObjects.take ();
            String output = task ();
            expensiveObjects.put (expensiveObject);
            if (output != null) {
                int counter = outputCount.getAndIncrement ();
                System.out.println (counter);
                if (counter >= 100) {
                    break;
                }
            }
        } catch (InterruptedException e) {
            System.out.println ("Error!");
        }
    }
}



@Override
public void run () {
    for(int i = 0; i < 100; i++) {
        Object obj = fetchExpensiveObject();
        String result = performTask();
        releaseExpensiveObject(obj);
        if( result != null ) {
            outputCounter.incrementAndGet();
            System.out.println(i);
        }
    }
}


