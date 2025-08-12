[STAThread] static void Main () {
    bool result;
    var mutex = new System.Threading.Mutex (true, "UniqueAppId", out result);
    if (! result) {
        MessageBox.Show ("Another instance is already running.");
        return;
    }
    Application.Run (new Form1 ());
    GC.KeepAlive (mutex);
}


 [STAThread] static void Main() {
    bool acquired;
    Mutex appMutex = new Mutex(true, "UniqueAppId", out acquired);
    if (acquired) {
        Application.EnableVisualStyles();
        Application.SetCompatibleTextRenderingDefault(false);
        Application.Run(new Form1());
    }
    else {
        MessageBox.Show("Another instance is already running.");
        return;
    }
    GC.KeepAlive(appMutex);
}


