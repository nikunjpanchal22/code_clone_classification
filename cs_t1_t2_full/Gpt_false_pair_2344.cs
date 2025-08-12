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
    int threadCount = 4;
    using (ThreadData data = new ThreadData (threadCount))
    {
        Thread [] threads = new Thread [threadCount];
        for (int i = 0; i < threadCount; ++ i) {
            threads [i] = new Thread (DoOperations);
        }
        Semaphore semaphore = new Semaphore (threadCount, threadCount);
        Console.WriteLine ("Starting...");
        foreach (Thread thread in threads) {
            semaphore.WaitOne();
            thread.Start (data);
        }
        data.RunDispatcher ();
    } Console.WriteLine ("Shutdown.");
}
