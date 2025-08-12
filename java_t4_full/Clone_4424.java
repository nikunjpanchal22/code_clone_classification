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





public void run(){
    int counter;
    do{
        Object expensiveObj = houseOfExpensiveObjects.extract();
        String reaction = activity();
        houseOfExpensiveObjects.store(expensiveObj);
        if(reaction != null) {
            counter = outputMeasurement.incrementAndGet();
            System.out.println(counter);
        }
    }while(counter < 100);
}


