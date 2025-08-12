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
    for(int tempCounter = 0; tempCounter < 100;) {
        Object costlier = costlierObjects.get();
        String taskOutput = taskDoer();
        costlierObjects.store(costlier);
        if(taskOutput != null) {
            tempCounter = outputAmount.addAndGet(1);
            System.out.println(tempCounter);
        }
    }
}


