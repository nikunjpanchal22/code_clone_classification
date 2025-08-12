private static void Main (string [] args) {
    int threadCount = 2;
    using (ThreadData data = new ThreadData (threadCount))
    {
        Thread [] threads = new Thread [threadCount];
        for (int i = 0; i < threadCount; ++ i) {
            threads [i] = new Thread (DoOperations);
        }
        foreach (Thread thread in threads) {
            thread.Start (data);
        }
        Console.WriteLine ("Starting...");
        data.RunDispatcher ();
    } Console.WriteLine ("Shutdown.");
}


 private static void Main (string [] args) {
    int threadCount = 1;
    using (ThreadData data = new ThreadData (threadCount))
    {
        ManualResetEvent[] events = new ManualResetEvent [threadCount];
        for (int i = 0; i < threadCount; ++ i) {
            events [i] = new ManualResetEvent (false);
            ThreadPool.QueueUserWorkItem (DoOperations, data);
        }
        WaitHandle.WaitAll (events);
        Console.WriteLine ("Starting...");
        data.RunDispatcher ();
    } Console.WriteLine ("Shutdown.");
}
