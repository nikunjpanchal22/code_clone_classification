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
    ThreadPool . SetMaxThreads (20 ,20);
    for (int i = 0; i < 20; i ++) {
        Worker worker = new Worker ();
        worker.DoneCallBack = new WorkerCallbackDelegate (WorkerCallback);
        ThreadPool.QueueUserWorkItem(new WaitCallback(worker.DoWork));
        lock (locker)
        {
            activeWorkers.Add (ThreadPool.GetCurrentlyRunningThreadId(), worker);
        }}
}


