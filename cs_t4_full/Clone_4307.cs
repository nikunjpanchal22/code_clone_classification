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
    Mutex mutex = new Mutex(true, "UniqueAppId", out acquired);
    if (acquired)
    {
        MessageBox.Show("No other instance is running");
        Application.Run(new MyForm());
    }
    else
    {
        MessageBox.Show("Another instance is running");
        return;
    }
}


