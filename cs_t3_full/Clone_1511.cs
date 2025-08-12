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
    Process[] p = Process.GetProcessesByName(Path.GetFileNameWithoutExtension(OnScreenKeyboardExe));
    if (p.Length == 0) 
    {
        ApartmentState threadState = Thread.CurrentThread.GetApartmentState();
        if (threadState == ApartmentState.STA)
        {
            // Create with a lambda expression
            Thread t = new Thread(() => StartOsk());
            t.SetApartmentState(ApartmentState.MTA);
            t.Start();
            t.Join();
        }
        else 
        {
            StartOsk();
        }
    }
    else 
    {
        IntPtr messageHandle = p[0].MainWindowHandle;
        IntPtr int_ptr = IntPtr.op_Explicit(SC_RESTORE);
        SendMessage(messageHandle, WM_SYSCOMMAND, int_ptr, IntPtr.Zero);
    }
}


