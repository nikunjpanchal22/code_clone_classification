[STAThread] static void Main () {
    bool createdNew = true;
    using (Mutex mutex = new Mutex (true, "MyMutexName", out createdNew))
    {
        if (createdNew) {
            Application.EnableVisualStyles ();
            Application.SetCompatibleTextRenderingDefault (false);
            Application.Run (new MainForm ());
        } else {
            Process currentProcess = Process.GetCurrentProcess ();
            foreach (Process process in Process.GetProcessesByName (currentProcess.ProcessName)) {
                if (process.Id != currentProcess.Id) {
                    IntPtr handle = process.MainWindowHandle;
                    if (handle != IntPtr.Zero)
                        SetForegroundWindow (handle);
                    else
                        PostMessage ((IntPtr) HWND_BROADCAST, WM_ACTIVATEAPP, IntPtr.Zero, IntPtr.Zero);
                    break;
                }
            }
        }
    }}


 [STAThread] static void Main () {
    bool createdNew = true;
    ManualResetEvent manualResetEvent = new ManualResetEvent (false);
    manualResetEvent.WaitOne ();
    if (createdNew) {
        Application.EnableVisualStyles ();
        Application.SetCompatibleTextRenderingDefault (false);
        Application.Run (new MainForm ());
    } else {
        Process currentProcess = Process.GetCurrentProcess ();
        foreach (Process process in Process.GetProcessesByName (currentProcess.ProcessName)) {
            if (process.Id != currentProcess.Id) {
                IntPtr handle = process.MainWindowHandle;
                if (handle != IntPtr.Zero)
                    SetForegroundWindow (handle);
                else
                    PostMessage ((IntPtr) HWND_BROADCAST, WM_ACTIVATEAPP, IntPtr.Zero, IntPtr.Zero);
                break;
            }
        }
    }
    manualResetEvent.Set (); 
}
