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





public void run() {
    while(true) {
        Object diamondObject = diamondObjects.take();
        String myOutput = myTask();
        diamondObjects.put(diamondObject);
        if(myOutput != null) {
            int myCounter = counterOfOutput.addAndGet(1);
            System.out.println(myCounter);
            if(myCounter >= 100) break;
        }
    }
}


