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


   static void Main()
     {
         BackgroundWorker worker = new BackgroundWorker();
         worker.WorkerReportsProgress = true;
         worker.WorkerSupportsCancellation = true;
         worker.DoWork += bw_DoWork;
         worker.ProgressChanged += bw_ProgressChanged;
         worker.RunWorkerCompleted += bw_RunWorkerCompleted;
         worker.RunWorkerAsync("Hello to worker");
         Console.WriteLine("Press Enter in the next 5 seconds to cancel");
         Console.ReadLine();
         if (worker.IsBusy)
             worker.CancelAsync();
         Console.ReadLine();
}
