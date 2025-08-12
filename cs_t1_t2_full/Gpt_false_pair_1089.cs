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
    CountdownEvent ce = new CountdownEvent (1);
    Thread t = new Thread (ReaderFunc);
    t.Start (ce);
    int index = 0;
    while (! ce.Wait (Timeout.Infinite)) {
        ++ index;
        Console.WriteLine (index.ToString ());
    }
    t.Join ();
}
