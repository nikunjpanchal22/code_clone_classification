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
    ManualResetEvent mre = new ManualResetEvent (false);
    Thread t = new Thread (ReaderFunc);
    t.Start (mre);
    int index = 0;
    while (! mre.WaitOne (Timeout.Infinite)) {
        ++ index;
        Console.WriteLine (index.ToString ());
    }
    t.Join ();
}
