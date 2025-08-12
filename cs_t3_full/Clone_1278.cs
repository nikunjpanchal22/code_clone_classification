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
    SemaphoreSlim semaphore = new SemaphoreSlim (20);
    for (int i = 0; i < 20; i ++) {
        semaphore.Wait();
        Worker worker = new Worker ();
        worker.DoneCallBack = new WorkerCallbackDelegate (WorkerCallback);
        ThreadPool.QueueUserWorkItem (new WaitCallback((object state) =>
        {
            worker.DoWork();
            semaphore.Release();
        }));
        lock (locker)
        {
           activeWorkers.Add (ThreadPool.GetCurrentlyRunningThreadId(), worker);
        }}
}


