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
        // Get the ApartmentState of the thread
        ApartmentState threadState = Thread.CurrentThread.GetApartmentState ();

        // Check the ApartmentState
        if (threadState == ApartmentState.STA) 
        {
            // Create a new thread with a delegate pointing to StartOsk
            // function
            Thread t = new Thread (new ThreadStart (StartOsk));

            // Set the ApartmentState to MTA
            t.SetApartmentState (ApartmentState.MTA);

            // Start and join the thread
            t.Start ();
            t.Join ();
        } 
        else 
        {
            // If the ApartmentState is already MTA, just call the StartOsk function
            StartOsk ();
        }
    } 
    else 
    {
        // If the process has already started, send the SC_RESTORE message
        SendMessage (p[0].MainWindowHandle, WM_SYSCOMMAND, IntPtr.op_Explicit(SC_RESTORE), IntPtr.Zero);
    }
}


