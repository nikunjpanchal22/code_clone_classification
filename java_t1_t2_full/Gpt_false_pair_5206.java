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


public void run () {
    while (true) {
        try {
            Object expensiveObject = expensiveObjects.poll ();
            if (expensiveObject == null) {
                break;
            }
            String output = task ();
            if (output != null) {
                int counter = outputCount.getAndIncrement ();
                System.out.println (counter);
                if (counter >= 100) {
                    break;
                }
                expensiveObjects.offer (expensiveObject);
            }
        } catch (InterruptedException e) {
            System.out.println ("Error!");
        }
    }
}
