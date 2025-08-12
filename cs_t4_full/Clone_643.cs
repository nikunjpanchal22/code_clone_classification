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
                        SetDoStuff(x, MethodForDelegate, MethodWithReturnValue);
                        x.DoStuff ();
                        x.DoStuffWithParameter (10);
                        int value = x.DoStuffWithReturnValue ();
                        Console.WriteLine ("Return value " + value);
                        Console.ReadLine ();
                    }

                        private void SetDoStuff(Example x, Action delegateMethod, Func<int> funcReturnMethod)
                        {
                            x.DoStuff = delegateMethod;
                            x.DoStuffWithParameter = delegateMethod;
                            x.DoStuffWithReturnValue = funcReturnMethod;
}


