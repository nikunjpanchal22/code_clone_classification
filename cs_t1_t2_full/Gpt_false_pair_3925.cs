static void Main (string [] args) {
    try {
        using (TestClass t = new TestClass ())
        {
            Thread ts = new Thread (new ThreadStart (t.GetTest));
            ts.Start ();
        }}
    catch (Exception ex) {
        Console.WriteLine ("Error: " + ex.Message);
    }
}


static void Main (string[] args) {
    try {
        TestClass t;
        using (t = new TestClass ())
        {
            Thread ts = new Thread (new ThreadStart (t.GetTest));
            ts.Start ();
        }
    }
    catch (Exception ex) {
        Console.WriteLine ("Error: " + ex.Message);
    }
}
