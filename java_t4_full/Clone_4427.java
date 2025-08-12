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
        Object pricyThing = priceyThings.take();
        String outputVal = job();
        priceyThings.put(pricyThing);
        if(outputVal != null) {
            i = outputCounter.incrementAndGet();
            System.out.println(i);
        }
    }
}


