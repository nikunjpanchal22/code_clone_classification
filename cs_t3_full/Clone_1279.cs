public void LaunchThreads () {
    for (int i = 0; i < 20; i ++) {
        Worker worker = new Worker ();
        worker.DoneCallBack = new WorkerCallbackDelegate (WorkerCallback);
        Thread thread = new Thread (worker.DoWork);
        thread.IsBackground = true;
        thread.Start ();
        lock (locker)
        {
            activeWorkers.Add (thread.ManagedThreadId, worker);
        }}
}


  public void LaunchThreads () {
    BlockingCollection<Action> blockingCollection = new BlockingCollection<Action>(20);

    for (int i = 0; i < 20; i++)
    {
        Worker worker = new Worker();
        worker.DoneCallBack = new WorkerCallbackDelegate (WorkerCallback);
        
        blockingCollection.Add(worker.DoWork);
    }

    Task[] tasks = blockingCollection.GetConsumingEnumerable().Select(action => Task.Factory.StartNew(action)).ToArray();
    Task.WaitAll(tasks);
    foreach (var t in tasks)
    {
        lock (locker)
        {
            activeWorkers.Add (t.Id, (Worker)worker);
        }
    }
}


