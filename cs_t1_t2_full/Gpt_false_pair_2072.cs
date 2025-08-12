[STAThread] static void Main (string [] args) {
    Process [] p = Process.GetProcessesByName (Path.GetFileNameWithoutExtension (OnScreenKeyboardExe));
    if (p.Length == 0) {
        if (Thread.CurrentThread.GetApartmentState () == ApartmentState.STA) {
            ThreadStart start = new ThreadStart (StartOsk);
            Thread thread = new Thread (start);
            thread.SetApartmentState (ApartmentState.MTA);
            thread.Start ();
            thread.Join ();
        } else {
            StartOsk ();
        }
    } else {
        SendMessage (p [0].MainWindowHandle, WM_SYSCOMMAND, new IntPtr (SC_RESTORE), new IntPtr (0));
    }
}


 [STAThread] 
static void Main (string [] args) 
{
    Process [] p = Process.GetProcessesByName (Path.GetFileNameWithoutExtension (OnScreenKeyboardExe));
    if (p.Length == 0) 
    {
        if (Thread.CurrentThread.GetApartmentState () == ApartmentState.STA) 
        {
            Thread t = new Thread (StartOsk);
            t.SetApartmentState (ApartmentState.MTA);
            t.Start(); 
            t.Join();
        } 
        else 
        {
            StartOsk ();
        }
    } 
    else 
    {
        SendMessage (p [0].MainWindowHandle, WM_SYSCOMMAND,  IntPtr.op_Explicit(SC_RESTORE), IntPtr.Zero);
    }
}
