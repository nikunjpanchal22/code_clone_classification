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


private string DoSomething3 () {
    int max = 10;
    for (int i = 1; i <= max; i ++) {
        Thread.Sleep (_Random.Next (100, 10000));
        if (_BackgroundWorker.CancellationPending) {
            return "Job aborted!";
        }
        AddMessage3 (String.Format ("Working on item {0} out of {1}", i, max));
        _BackgroundWorker.ReportProgress3 ((i * 100) / max);
    }
    return "Done with the job.";
}
