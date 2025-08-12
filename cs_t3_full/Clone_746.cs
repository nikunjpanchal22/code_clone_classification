private static void Main (string [] args) {
    Thread t = new Thread (ReaderFunc);
    t.Start ();
    int index = 0;
    while (! StopWriting.WaitOne (Timeout.Infinite)) {
        ++ index;
        Console.WriteLine (index.ToString ());
    }
    t.Join ();
}


 private static void Main (string [] args) {
    // Using Interrup()
    ReaderFunc x = new ReaderFunc ();
    Thread t = new Thread (ReaderFunc);
    t.Start (x);
    int index = 0;
    while (t.IsAlive) {
        ++ index;
        Console.WriteLine (index.ToString ());
        t.Interrupt ();
    }
    t.Join ();
}


