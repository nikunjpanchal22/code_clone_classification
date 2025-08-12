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


	static void Main (string [] args)
{
    TestClass t = null; 
    try{
        t = new TestClass ();
        t.GetTest.InvokeInThread ();
    }
    catch (Exception ex) {
        try {t.Dispose();} catch {}
        Console.WriteLine ("Error: " + ex.Message);
    }
}


