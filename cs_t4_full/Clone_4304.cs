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
    bool running;
    Mutex appMutex = new Mutex(true, "UniqueAppId", out running);
    if(running) {
        Application.EnableVisualStyles();
        Application.SetCompatibleTextRenderingDefault(false);
        Application.Run(new Form1());
        GC.KeepAlive(appMutex);
    }
    else {
        MessageBox.Show("Another instance is already running.");
        return;
    }
}


