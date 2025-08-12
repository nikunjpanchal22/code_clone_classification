private string DoSomething () {
    int max = 10;
    for (int i = 1; i <= max; i ++) {
        Thread.Sleep (_Random.Next (10, 1000));
        if (_BackgroundWorker.CancellationPending) {
            return "Job aborted!";
        }
        AddMessage (String.Format ("Currently working on item {0} of {1}", i, max));
        _BackgroundWorker.ReportProgress ((i * 100) / max);
    }
    return "Job is done.";
}


 private string DoSomething () {
    int max = 10;
    try 
    {
        for (int i = 1; i <= max; i++) {
            WaitHandle.WaitAny (new WaitHandle[] {cancellationEvent, signalEvent}, _Random.Next (10, 1000));
            if (cancellationEvent.WaitOne (0)) {
                return "Job aborted!";
            }
            AddMessage (String.Format ("Currently working on item {0} of {1}", i, max));
            _BackgroundWorker.ReportProgress ((i * 100) / max);
        }
    }
    finally
    {
        cancellationEvent.Close();
        signalEvent.Close();
    }
    return "Job is done.";
}


