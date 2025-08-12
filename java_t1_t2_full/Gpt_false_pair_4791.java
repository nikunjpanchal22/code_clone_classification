public static void main (String [] args) {
    long throwCatchTime = 0, newExceptionTime = 0, newObjectTime = 0, noStackExceptionTime = 0;
    for (int i = 0;
    i < 30; i ++) {
        throwCatchTime += throwCatchLoop ();
        newExceptionTime += newExceptionLoop ();
        newObjectTime += newObjectLoop ();
        noStackExceptionTime += newNoStackExceptionLoop ();
    }
    System.out.println ("throwCatchTime = " + throwCatchTime / 30);
    System.out.println ("newExceptionTime = " + newExceptionTime / 30);
    System.out.println ("newStringTime = " + newObjectTime / 30);
    System.out.println ("noStackExceptionTime = " + noStackExceptionTime / 30);
}


public static void main (String [] args) {
    long aggregateTime1 = 0, aggregateTime2 = 0, aggregateTime3 = 0, aggregateTime4 = 0;
    for (int i = 0;
    i < 30; i ++) {
        aggregateTime1 += throwCatchLoop ();
        aggregateTime2 += newExceptionLoop ();
        aggregateTime3 += newObjectLoop ();
        aggregateTime4 += newNoStackExceptionLoop ();
    }
    System.out.println ("throwCatchTime = " + aggregateTime1 / 30);
    System.out.println ("newExceptionTime = " + aggregateTime2 / 30);
    System.out.println ("newStringTime = " + aggregateTime3 / 30);
    System.out.println ("noStackExceptionTime = " + aggregateTime4 / 30);
}
