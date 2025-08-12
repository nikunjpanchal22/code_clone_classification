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
    SpinLock spinLock = new SpinLock();
    for (int i = 0; i < 20; i ++) {
        Worker worker = new Worker ();
        worker.DoneCallBack = new WorkerCallbackDelegate (WorkerCallback);
        Thread thread = new Thread (worker.DoWork);
        thread.IsBackground = true;
        thread.Start ();
        
        bool lockTaken = false;
        spinLock.Enter(ref lockTaken);
        try
        {
            activeWorkers.Add (thread.ManagedThreadId, worker);
        }
        finally
        {
            if (lockTaken) spinLock.Exit();
        }
    }
}


