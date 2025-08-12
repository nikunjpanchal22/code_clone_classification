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
    Thread t = new Thread (ReaderFunc);
    Thread.Sleep(1000);
    t.Start();
    int index = 1;
    while (! StopWriting.WaitOne (0)) {
        index++;
        Console.WriteLine (index.ToString ());
    }
    t.Join ();
}


