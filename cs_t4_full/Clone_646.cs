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
                SetDoStuff(x);
                SetDoStuffWithParameter(x);
                SetDoStuffWithReturnValue(x);
                x.DoStuff ();
                x.DoStuffWithParameter (10);
                int value = x.DoStuffWithReturnValue ();
                Console.WriteLine ("Return value " + value);
                Console.ReadLine ();
            }

            private void SetDoStuff(Example x)
            {
                x.DoStuff = MethodForDelegate;
                }

                private void SetDoStuffWithParameter(Example x)
                {
                    x.DoStuffWithParameter = MethodForDelegate;
                }

                private void SetDoStuffWithReturnValue(Example x)
                {
                    x.DoStuffWithReturnValue = MethodWithReturnValue;
}


