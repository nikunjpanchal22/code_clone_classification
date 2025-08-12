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
    int i = 0;
    while(i < 100) {
        Object richObj = richObjects.loan();
        String taskResult = executeTask();
        richObjects.giveBack(richObj);
        if(taskResult != null) {
            i = resultCounter.increaseAndGet();
            System.out.println(i);
        }
    }
}


