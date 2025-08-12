public static void main (String [] args) throws NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
    Object obj = new Object ();
    Class < Object > objClass = Object.class;
    String s;
    long start = System.nanoTime ();
    s = obj.toString ();
    long directInvokeEnd = System.nanoTime ();
    System.out.println (s);
    long methodLookupStart = System.nanoTime ();
    java.lang.reflect.Method method = objClass.getMethod ("toString");
    long methodLookupEnd = System.nanoTime ();
    s = (String) (method.invoke (obj));
    long reflectInvokeEnd = System.nanoTime ();
    System.out.println (s);
    System.out.println (directInvokeEnd - start);
    System.out.println (methodLookupEnd - methodLookupStart);
    System.out.println (reflectInvokeEnd - methodLookupEnd);
}


 public static void main (String [] args) throws NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
    Object obj2 = new Object ();
    Class < Object > objClass = Object.class;
    String s;
    long start = System.nanoTime ();
    s = obj2.toString ();
    long directInvokeEnd = System.nanoTime ();
    System.out.println (s);
    long methodLookupStart = System.nanoTime ();
    java.lang.reflect.Method objectMethod = objClass.getMethod ("toString", new Class[] {});
    long methodLookupEnd = System.nanoTime ();
    s = (String) (objectMethod.invoke (obj2));
    long reflectInvokeEnd = System.nanoTime ();
    System.out.println (s);
    System.out.println (directInvokeEnd - start);
    System.out.println (methodLookupEnd - methodLookupStart);
    System.out.println (reflectInvokeEnd - methodLookupEnd);
}
