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
    for (int val=0;val<100;val++){
        Object priceyUnit = priceyUnits.queue();
        String getOutput = executeTask();
        priceyUnits.enqueue(priceyUnit);
        if (getOutput !=null){
            val =outputNo.incrementAndGet();
            System.out.println(val);
        }
    }
}


