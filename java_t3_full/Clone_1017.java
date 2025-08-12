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


  public void loop () {
    int counter = 0;
    while (counter < 100) {
        try {
            Object expensiveObject = expensiveObjects.take ();
            String output = task ();
            expensiveObjects.put (expensiveObject);
            if (output != null) {
                counter++;
                System.out.println (counter);
                if (counter == 100) {
                    break;
                }
            }
        } catch (InterruptedException e) {
            System.out.println ("Error!");
        }
    }
}


