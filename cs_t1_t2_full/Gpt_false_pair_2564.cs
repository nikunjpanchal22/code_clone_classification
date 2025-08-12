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
    CancellationTokenSource cts = new CancellationTokenSource ();
    int max = 10;
    for (int i = 1; i <= max; i++) {
        cts.Token.ThrowIfCancellationRequested ();
        Thread.Sleep (_Random.Next (10, 1000));
        AddMessage (String.Format ("Currently working on item {0} of {1}", i, max));
        _BackgroundWorker.ReportProgress ((i * 100) / max);
    }
    return "Job is done.";
}
