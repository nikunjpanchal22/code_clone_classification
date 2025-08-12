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
    Barrier b = new Barrier (2);
    Thread t = new Thread (ReaderFunc);
    t.Start (b);
    int index = 0;
    while (! b.SignalAndWait (Timeout.Infinite)) {
        ++ index;
        Console.WriteLine (index.ToString ());
    }
    t.Join ();
}
