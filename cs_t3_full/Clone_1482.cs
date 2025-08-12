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


   private void ExecuteBackgroundWorkerCode2()
     { 
        BackgroundWorker bg = new BackgroundWorker();
        bg.WorkerReportsProgress = true;
        bg.WorkerSupportsCancellation = true;
        bg.DoWork += bw_DoWork;
        bg.ProgressChanged += bw_ProgressChanged;
        bg.RunWorkerCompleted += bw_RunWorkerCompleted;
        bg.RunWorkerAsync("Hello to worker");
        Console.WriteLine("Press Enter in the next 5 seconds to cancel");
        Console.ReadLine();
        if (bg.IsBusy)
            bg.CancelAsync();
        Console.ReadLine();
}


