static void Main (string [] args) {
    CancellationTokenSource tokenSource = new CancellationTokenSource ();
    tokenSourceQueue.Enqueue (tokenSource);
    ConcurrentDictionary < int, int > startedThreads = new ConcurrentDictionary < int, int > ();
    for (int i = 0; i < 10; i ++) {
        Thread.Sleep (1000);
        Task.Factory.StartNew(()=>{
            startedThreads.AddOrUpdate (Thread.CurrentThread.ManagedThreadId, Thread.CurrentThread.ManagedThreadId, (a, b)=> b);
            for (int j = 0; j < 50; j ++)
                Task.Factory.StartNew (()=> startedThreads.AddOrUpdate (Thread.CurrentThread.ManagedThreadId, Thread.CurrentThread.ManagedThreadId, (a, b)=> b));
            for (int j = 0; j < 50; j ++) {
                Task.Factory.StartNew (()=> {
                    while (! tokenSource.Token.IsCancellationRequested) {
                        if (startedThreads.ContainsKey (Thread.CurrentThread.ManagedThreadId))
                            Console.WriteLine ("Thread reused");
                        Thread.CurrentThread.Block (10);
                        if (startedThreads.ContainsKey (Thread.CurrentThread.ManagedThreadId))
                            Console.WriteLine ("Thread reused");
                    }
                }, tokenSource.Token, TaskCreationOptions.LongRunning, TaskScheduler.Default).ContinueWith (task=> {
                    WriteExceptions (task.Exception);
                    Console.WriteLine ("-----------------------------");
                }, TaskContinuationOptions.OnlyOnFaulted);
            }
            Thread.CurrentThread.Block ();
        }, tokenSource.Token, TaskCreationOptions.LongRunning, TaskScheduler.Default).ContinueWith (task=> {
            WriteExceptions (task.Exception);
            Console.WriteLine ("-----------------------------");
        }, TaskContinuationOptions.OnlyOnFaulted);
    }
    Console.Read ();
}


 static void Main (string [] args) {
    SemaphoreSlim semaphoreSlim = new SemaphoreSlim(1);
    Queue<SemaphoreSlim> tokenSourceQueue = new Queue<SemaphoreSlim>();
    tokenSourceQueue.Enqueue(semaphoreSlim);
    ConcurrentDictionary < int, int > startedThreads = new ConcurrentDictionary < int, int > ();
    for (int i = 0; i < 10; i ++) {
        Thread.Sleep (1000);
        Task.Factory.StartNew (()=> {
            startedThreads.AddOrUpdate (Thread.CurrentThread.ManagedThreadId, Thread.CurrentThread.ManagedThreadId, (a, b)=> b);
            for (int j = 0; j < 50; j ++)
                Task.Factory.StartNew (()=> startedThreads.AddOrUpdate (Thread.CurrentThread.ManagedThreadId, Thread.CurrentThread.ManagedThreadId, (a, b)=> b));
            for (int j = 0; j < 50; j ++) {
                Task.Factory.StartNew (()=> {
                    while (semaphoreSlim.Wait(10)) {
                        if (startedThreads.ContainsKey (Thread.CurrentThread.ManagedThreadId))
                            Console.WriteLine ("Thread reused");
                        Thread.CurrentThread.Block (10);
                        if (startedThreads.ContainsKey (Thread.CurrentThread.ManagedThreadId))
                            Console.WriteLine ("Thread reused");
                    }
                }, TaskCreationOptions.LongRunning, TaskScheduler.Default).ContinueWith (task=> {
                    WriteExceptions (task.Exception);
                    Console.WriteLine ("-----------------------------");
                }, TaskContinuationOptions.OnlyOnFaulted);
            }
            Thread.CurrentThread.Block ();
        },TaskCreationOptions.LongRunning, TaskScheduler.Default).ContinueWith (task=> {
            WriteExceptions (task.Exception);
            Console.WriteLine ("-----------------------------");
        }, TaskContinuationOptions.OnlyOnFaulted);
    }
    Console.Read ();
}
