public static void main (String [] args) throws Exception {
    int loops = 1000 * 1000;
    Object object = new Object ();
    long start = System.nanoTime ();
    Object s;
    testMethodCall (object, loops);
    long regularCalls = System.nanoTime () - start;
    java.lang.reflect.Method method = Object.class.getMethod ("getClass");
    method.setAccessible (true);
    start = System.nanoTime ();
    testInvoke (object, loops, method);
    long reflectiveCalls = System.nanoTime () - start;
    start = System.nanoTime ();
    testGetMethodInvoke (object, loops);
    long reflectiveLookup = System.nanoTime () - start;
    System.out.println ("Average regular method calls:" + regularCalls / loops + " ns.");
    System.out.println ("Average reflective method calls without lookup:" + reflectiveCalls / loops + " ns.");
    System.out.println ("Average reflective method calls with lookup:" + reflectiveLookup / loops + " ns.");
}


  public static void main (String [] args) throws Exception {
    int loopCount = 1000 * 1000;
    AnObject object = new AnObject ();
    long startTime;
    long regularCallTime;
    long reflectiveCallTime;
    long reflectiveLookupTime;
    
    startTime = System.nanoTime ();
    testMethodCall (object, loopCount); 
    regularCallTime = System.nanoTime () - startTime;
    // get method from class
    java.lang.reflect.Method targetMethod = AnObject.class.getDeclaredMethod ("getState");
    targetMethod.setAccessible (true);
    startTime = System.nanoTime ();
    testInvoke (object, loopCount, targetMethod);
    reflectiveCallTime = System.nanoTime () - startTime;    
    startTime = System.nanoTime ();      
    testGetMethodInvoke (object, loopCount); 
    reflectiveLookupTime = System.nanoTime () - startTime;
    System.out.println ("Average regular method calls: " + regularCallTime / loopCount + " ns.");
    System.out.println ("Average reflective method calls without lookup: " + reflectiveCallTime / loopCount + " ns.");
    System.out.println ("Average reflective method calls with lookup: " + reflectiveLookupTime / loopCount + " ns.");
}


