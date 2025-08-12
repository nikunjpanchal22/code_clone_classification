static void Main (string [] args) {
    var x = new Example ();
    x.DoStuff = MethodForDelecate;
    x.DoStuffWithParameter = MethodForDelecate;
    x.DoStuffWithReturnValue = MethodWithReturnValue;
    x.DoStuff ();
    x.DoStuffWithParameter (10);
    int value = x.DoStuffWithReturnValue ();
    Console.WriteLine ("Return value " + value);
    Console.ReadLine ();
}


 static void Main (string [] args) {
    var x = new Example ();
    x.DoStuff = new DoStuff<Object> (MethodForDelegeate);
    x.DoStuffWithParameter = new DoStuff<int>(MethodForDelegeate);
    x.DoStuffWithReturnValue =  new Func<int>(MethodWithReturnValue);
    x.DoStuff ();
    x.DoStuffWithParameter (10);
    int value = x.DoStuffWithReturnValue ();
    Console.WriteLine ("Return value " + value);
    Console.ReadLine ();
}


