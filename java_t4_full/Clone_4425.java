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
    int counter = 0;
    while(counter < 100){
        Object lavishThing = lavishThings.borrow();
        String producedOutput = operation();
        lavishThings.returnBack(lavishThing);
        if(producedOutput != null) {
            counter = outputsCount.increment();
            System.out.println(counter);
        }
    }
}


