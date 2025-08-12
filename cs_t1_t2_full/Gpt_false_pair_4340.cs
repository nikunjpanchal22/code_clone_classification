static void Main (string [] args) {
    BackgroundWorker bg = new BackgroundWorker ();
    bg.DoWork += new DoWorkEventHandler (bg_DoWork);
    bg.RunWorkerCompleted += new RunWorkerCompletedEventHandler (bg_RunWorkerCompleted);
    bg.RunWorkerAsync ();
    while (! done) {
        Console.WriteLine ("Waiting in Main, tid " + Thread.CurrentThread.ManagedThreadId);
        Thread.Sleep (100);
    }
}


static void Main (string [] args) {
    BackgroundWorker bg = new BackgroundWorker ();
    bg.DoWork += new DoWorkEventHandler (bg_DoWork);
    bg.RunWorkerCompleted += new RunWorkerCompletedEventHandler (bg_RunWorkerCompleted);
    bg.RunWorkerAsync ();
    while (! done) {
        Console.WriteLine ("Waiting in 'Main' method, thread ID: " + Thread.CurrentThread.ManagedThreadId);
        System.Threading.Thread.Sleep (100);
    }
}
