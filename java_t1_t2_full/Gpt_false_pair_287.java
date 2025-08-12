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
    long throwCatchTime = 0, newExceptionTime = 0, newObjectTime = 0, noStackExceptionTime = 0;
   for (int i = 0; i < 30; i++) {
        try {
            throwCatchTime += throwCatchLoop ();
            newExceptionTime += newExceptionLoop ();
            newObjectTime += newObjectLoop ();
            noStackExceptionTime += newNoStackExceptionLoop ();
        } catch (Exception e) {
            System.err.println("Error Occurred in loop " + i);
        }
    }
    System.out.println ("throwCatchTime = " + throwCatchTime/30);
    System.out.println ("newExceptionTime = " + newExceptionTime/30);
    System.out.println ("newStringTime = " + newObjectTime/30);
    System.out.println ("noStackExceptionTime = " + noStackExceptionTime/30);
}
