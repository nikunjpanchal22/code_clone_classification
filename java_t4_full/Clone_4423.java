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
public void run() {
    int counter;
    do {
        Object costlyObject = costlyObjects.take();
        String aTask = perform();
        costlyObjects.add(costlyObject);
        if(aTask != null) {
            counter = outputCounter.increment();
            System.out.println(counter);
        }
    } while (counter < 100);
}


