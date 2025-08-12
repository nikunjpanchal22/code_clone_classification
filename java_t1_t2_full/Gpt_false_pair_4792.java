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
    long time1 = 0, time2 = 0, time3 = 0, time4 = 0;
    for (int i = 0;
    i < 30; i ++) {
        time1 += throwCatchLoop ();
        time2 += newExceptionLoop ();
        time3 += newObjectLoop ();
        time4 += newNoStackExceptionLoop ();
    }
    System.out.println ("throwCatchTime = " + time1 / 30);
    System.out.println ("newExceptionTime = " + time2 / 30);
    System.out.println ("newStringTime = " + time3 / 30);
    System.out.println ("noStackExceptionTime = " + time4 / 30);
}
