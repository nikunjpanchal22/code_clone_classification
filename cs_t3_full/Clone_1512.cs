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
    // Get all the processes by name
    Process[] processes = Process.GetProcessesByName (Path.GetFileNameWithoutExtension (OnScreenKeyboardExe));
    
    // If there are no processes, start one
    if (processes.Length == 0) 
    {
        // Get current thread's apartment state
        ApartmentState state = Thread.CurrentThread.GetApartmentState ();
        
        // If state is STA, create a thread
        if (state == ApartmentState.STA) 
        {
            Thread thread = new Thread (StartOsk);
            
            // Set apartment state to MTA
            thread.SetApartmentState (ApartmentState.MTA);
            thread.Start ();
            thread.Join ();
        }
        else 
        {
            // Otherwise, just start OSK
            StartOsk ();
        }
    }
    else 
    {
        // If process exists, send SC_RESTORE message
        IntPtr messageHandle = processes[0].MainWindowHandle;
        IntPtr int_ptr = IntPtr.op_Explicit (SC_RESTORE);
        SendMessage (messageHandle, WM_SYSCOMMAND, int_ptr, IntPtr.Zero);
    }
}


