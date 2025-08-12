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
    Semaphore s = new Semaphore (0, 1);
    Thread t = new Thread (ReaderFunc);
    t.Start (s);
    int index = 0;
    while (! s.WaitOne (Timeout.Infinite)) {
        ++ index;
        Console.WriteLine (index.ToString ());
    }
    t.Join ();
}
