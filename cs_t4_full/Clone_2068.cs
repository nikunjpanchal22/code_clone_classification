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
    ManualResetEvent doneEvent = new ManualResetEvent (false);
    for (int i = 1; i <= max; i++) {
        BackgroundWorker workerThread = new BackgroundWorker ();
        workerThread.DoWork += new DoWorkEventHandler (delegate (object sender, DoWorkEventArgs e) {
            Thread.Sleep (_Random.Next (10, 1000));
            if (_BackgroundWorker.CancellationPending) {
                e.Cancel = true;
            }
            AddMessage (String.Format ("Currently working on item {0} of {1}", i, max));
            doneEvent.Set ();
            _BackgroundWorker.ReportProgress ((i * 100) / max);
        });
        workerThread.RunWorkerAsync ();
        doneEvent.WaitOne (TimeSpan.FromSeconds (30));
        doneEvent.Reset ();
        if (_BackgroundWorker.CancellationPending) {
            doneEvent.Close ();
            return "Job aborted!";
        }
    }
    doneEvent.Close ();
    return "Job is done.";
}


