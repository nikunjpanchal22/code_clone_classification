public static void main (String args []) {
    Object sharedObject = new Object ();
    MyClass sampleA = new MyClass ();
    sampleA.myObject = sharedObject;
    MyClass sampleB = new MyClass ();
    sampleB.myObject = sharedObject;
    System.out.println (sampleA.sharedObject == sampleB.sharedObject);
    System.out.println (sampleA == sampleB);
}


public static void main (String args []) {
    Object sharedObjectA = new Object ();
    Object sharedObjectB = sharedObjectA;
    MyClass sampleA = new MyClass ();
    sampleA.myObject = sharedObjectA;
    MyClass sampleB = new MyClass ();
    sampleB.myObject = sharedObjectB;
    System.out.println (sampleA.sharedObject == sampleB.sharedObject);
    System.out.println (sampleA == sampleB);
}
