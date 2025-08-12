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
    Object expensiveUnit;
    String output;
    int oppCounts=0;
    while (oppCounts <= 100) { 
        try {
            expensiveUnit = expensiveUnits.take ();
            output = operation ();
            expensiveUnits.put (expensiveUnit);
            if (output != null) 
                System.out.println (counts++);
        } 
        catch (InterruptedException e) { System.out.println ("Error!"); }
    }
}


