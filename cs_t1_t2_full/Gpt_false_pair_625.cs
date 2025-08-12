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


	[STAThread] static void Main () {
    bool result;
    var monitor = new System.Threading.Monitor ("UniqueAppId", out result);
    if (! result) {
        MessageBox.Show ("Another instance is already running.");
        return;
    }
    Application.Run (new Form1 ());
    GC.KeepAlive (monitor);
}
