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
    var m1 = new System.Threading.Mutex (true, "UniqueAppId", out result);
    var m2 = new System.Threading.Mutex (true, "UniqueAppId2", out result);
    if (! result) {
        MessageBox.Show ("Another instance is already running.");
        return;
    }
    Application.Run (new Form1 ());
    GC.KeepAlive (m1);
    GC.KeepAlive (m2);
}
