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
    CountdownEvent countDownEvent = new CountdownEvent (max);
    using (var pool = new ThreadPool (max))
    {
        for (int i = 1; i < max; i++)
        {
            int j = i;
            pool.QueueTask (() =>
            {
                Thread.Sleep (_Random.Next (10, 1000));
                if (_BackgroundWorker.CancellationPending) {
                    countDownEvent.Signal ();
                    return "Job aborted!";
                }
                AddMessage (String.Format ("Currently working on item {0} of {1}", j, max));
                _BackgroundWorker.ReportProgress ((j * 100) / max);
                countDownEvent.Signal ();
            });
        }
    }
    countDownEvent.Wait ();
    return "Job is done.";
}


