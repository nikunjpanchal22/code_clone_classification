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
    CountdownEvent countDownEvent = new CountdownEvent(20);
    for (int i = 0; i < 20; i ++) {
        Worker worker = new Worker ();
        worker.DoneCallBack = new WorkerCallbackDelegate (WorkerCallback);
        ThreadPool.QueueUserWorkItem (new WaitCallback((object state) =>
        {
            try
            {
                worker.DoWork();
            }
            finally
            {
                countDownEvent.Signal();
            }
        }));
        lock (locker)
        {
            activeWorkers.Add (ThreadPool.GetCurrentlyRunningThreadId(), worker);
        }}
    countDownEvent.Wait();
}


