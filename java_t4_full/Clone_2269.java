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


 public static void main(String[] args) throws Exception
    {   
    int loops = 1000 *1000;
    Object object = new Object ();
    long startPoint;
    long regularAverage;
    long reflectionAverage;
    long reflectiveLookup;
    
        startPoint = System.nanoTime();
        object = invokeRegularMethod(object,loops);
        regularAverage = System.nanoTime() - startPoint;
        java.lang.reflect.Method method = Object.class.getDeclaredMethod("getClass");
        method.setAccessible(true);
        startPoint = System.nanoTime();
        invokeReflectiveMethod(object,loops,method);
        reflectionAverage = System.nanoTime() - startPoint;
        startPoint = System.nanoTime();
        invokeReflectiveMethodWithLookUp(object, loops);
        reflectiveLookup = System.nanoTime() - startPoint;
        System.out.println("Average regular method calls :" + regularAverage/loops+ " ns.");
        System.out.println("Average reflective method calls without lookup:"+ reflectionAverage/loops+" ns.");
        System.out.println("Average reflective method calls with lookup :" + reflectiveLookup/loops+" ns.");
    }

 public static void main(String[] args) throws Exception {
    int loops = 1000000;
    AnObject object = new AnObject ();
    long startTime;
    long regularCallsTime;
    long reflectiveCallsTime;
    long reflectiveLookupTime;
    
    startTime = System.nanoTime();
    object = testInvokeRegularMethod(object, loops);
    regularCallsTime = System.nanoTime() - startTime;
    java.lang.reflect.Method method = AnObject.class.getDeclaredMethod("getState");
    method.setAccessible(true);
    startTime = System.nanoTime();
    object = testInvokeReflectiveMethod(object, loops, method);
    reflectiveCallsTime = System.nanoTime() - startTime;
    startTime = System.nanoTime();
    object = testInvokeReflectiveMethodWithLookup(object, loops);
    reflectiveLookupTime = System.nanoTime() - startTime;
    System.out.println("Average regular method calls: " + regularCallsTime/loops +" ns.");
    System.out.println("Average reflective method calls without lookup: "+ reflectiveCallsTime/loops +" ns.");
    System.out.println("Average reflective method calls with lookup: "+ reflectiveLookupTime/loops +" ns.");
}


