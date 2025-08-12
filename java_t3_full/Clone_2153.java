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


 public static void main(String[] args) throws Exception {
    int loops = 1000 * 1000;
    AnObject object = new AnObject ();
    long start;
    long regularCallTime;
    long reflectiveCallTime;
    long reflectiveLookupTime;
    
    start = System.nanoTime();
    invokeRegularMethod(object, loops);
    regularCallTime = System.nanoTime () - start;
    java.lang.reflect.Method method = AnObject.class.getDeclaredMethod ("getState");
    method.setAccessible (true);
    start = System.nanoTime ();
    invokeReflectiveMethod (object, loops, method);
    reflectiveCallTime = System.nanoTime () - start;    
    start = System.nanoTime ();      
    invokeReflectiveMethodWithLookUp (object, loops); 
    reflectiveLookupTime = System.nanoTime() - start;
    System.out.println ("Average regular method calls: " + regularCallTime / loops + " ns.");
    System.out.println ("Average reflective method calls without lookup: " + reflectiveCallTime / loops + " ns.");
    System.out.println ("Average reflective method calls with lookup: " + reflectiveLookupTime / loops + " ns.");
}


