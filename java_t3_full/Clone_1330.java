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
    Object sharedObject = new Object ();
    MyClass sampleA = new MyClass ();
    MyClass sampleB = new MyClass ();
    sampleA.myObject = sharedObject;
    sampleB.myObject = sharedObject;
    System.out.println (Objects.equals(sampleA.sharedObject, sampleB.sharedObject));
    System.out.println (sampleA == sampleB);
}


