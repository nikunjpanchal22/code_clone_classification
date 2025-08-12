static void Main () {
    _bw = new BackgroundWorker {WorkerReportsProgress = true, WorkerSupportsCancellation = true};
    _bw.DoWork += bw_DoWork;
    _bw.ProgressChanged += bw_ProgressChanged;
    _bw.RunWorkerCompleted += bw_RunWorkerCompleted;
    _bw.RunWorkerAsync ("Hello to worker");
    Console.WriteLine ("Press Enter in the next 5 seconds to cancel");
    Console.ReadLine ();
    if (_bw.IsBusy)
        _bw.CancelAsync ();
    Console.ReadLine ();
}


   private void StartWork()
     {
        var backgroundWorker = new BackgroundWorker{WorkerReportsProgress = true, WorkerSupportsCancellation = true};
        backgroundWorker.DoWork += bw_DoWork;
        backgroundWorker.ProgressChanged += bw_ProgressChanged;
        backgroundWorker.RunWorkerCompleted += bw_RunWorkerCompleted;
        backgroundWorker.RunWorkerAsync("Hello to worker");
        Console.WriteLine("Press Enter in the next 5 seconds to cancel");
        Console.ReadLine();
        if (backgroundWorker.IsBusy)
            backgroundWorker.CancelAsync();
        Console.ReadLine();
}
