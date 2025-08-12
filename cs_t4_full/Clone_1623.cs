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


  public void RunBackgroundJob()
     { 
        BackgroundWorker bg = new BackgroundWorker();
        bg.WorkerReportsProgress = true;
        bg.WorkerSupportsCancellation = true;
        bg.DoWork += new DoWorkEventHandler(bw_DoWork);
        bg.ProgressChanged += new ProgressChangedEventHandler(bw_ProgressChanged);
        bg.RunWorkerCompleted += new RunWorkerCompletedEventHandler(bw_RunWorkerCompleted);
        bg.RunWorkerAsync("Hello to worker");
        Console.WriteLine("Press Enter in the next 5 seconds to cancel");
        Console.ReadLine();
        if (bg.IsBusy)
            bg.CancelAsync();
        Console.ReadLine();
}


