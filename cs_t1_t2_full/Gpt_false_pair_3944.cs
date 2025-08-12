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
    for (int i = 0; i < 20; i ++) {
        Helper helper = new Helper ();
        helper.CompleteCallBack = new HelperCallbackDelegate (HelperCallback);
        Thread thread = new Thread (helper.DoTask);
        thread.IsBackground = true;
        thread.Start ();
        lock (locker)
        {
            activeHelpers.Add (thread.ManagedThreadId, helper);
        }}
}
