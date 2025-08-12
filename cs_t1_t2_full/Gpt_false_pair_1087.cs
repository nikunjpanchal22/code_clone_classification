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
    // Using EventWaitHandle
    EventWaitHandle ewh = new EventWaitHandle (false,EventResetMode.AutoReset);
    Thread t = new Thread (ReaderFunc);
    t.Start (ewh);
    int index = 0;
    while (! ewh.WaitOne (Timeout.Infinite)) {
        ++ index;
        Console.WriteLine (index.ToString ());
    }
    t.Join ();
}
