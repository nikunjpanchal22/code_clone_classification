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
    int threadCount = 8;
    using (ThreadData data = new ThreadData (threadCount))
    {
        CountdownEvent countdownEvent = new CountdownEvent(threadCount); 
        for (int i = 0; i < threadCount; ++ i) {
            ThreadPool.QueueUserWorkItem (DoOperations, data);
            countdownEvent.Signal();
        }
        Console.WriteLine ("Starting...");
        countdownEvent.Wait();
        data.RunDispatcher ();
    } Console.WriteLine ("Shutdown.");
}


