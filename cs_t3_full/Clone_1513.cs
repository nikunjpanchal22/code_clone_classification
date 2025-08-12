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
    Process [] p = Process.GetProcessesByName(Path.GetFileNameWithoutExtension(OnScreenKeyboardExe));
    if (p.Length == 0) 
    {
        ApartmentState threadState = Thread.CurrentThread.GetApartmentState();
        if (threadState == ApartmentState.STA) 
        {
            // Create a new thread
            Thread t = new Thread(StartOsk);

            // Set the ApartmentState to MTA
            t.SetApartmentState(ApartmentState.MTA);

            // Start the thread
            t.Start();

            // Join the thread
            t.Join();
        }
        else
        {
            // If the ApartmentState is already MTA, just call the StartOsk function
            StartOsk();
        }
    }
    else
    {
        // If the process is already started, send the SC_RESTORE message
        IntPtr messageHandle = p[0].MainWindowHandle;
        IntPtr intPtrRestoreSc = IntPtr.op_Explicit(SC_RESTORE);
        SendMessage(messageHandle, WM_SYSCOMMAND, intPtrRestoreSc, IntPtr.Zero);
    }
}


