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
        Processor processor = new Processor ();
        processor.ResultsCallBack = new ProcessorCallbackDelegate (ProcessorCallback);
        Thread thread = new Thread (processor.Process);
        thread.IsBackground = true;
        thread.Start ();
        lock (locker)
        {
            activeProcessors.Add (thread.ManagedThreadId, processor);
        }}
}
