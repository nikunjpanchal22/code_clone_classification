private static bool GetFileNameFromHandle (IntPtr handle, out string fileName, int wait) {
    using (FileNameFromHandleState f = new FileNameFromHandleState (handle))
    {
        ThreadPool.QueueUserWorkItem (new WaitCallback (GetFileNameFromHandle), f);
        if (f.WaitOne (wait)) {
            fileName = f.FileName;
            return f.RetValue;
        } else {
            fileName = string.Empty;
            return false;
        }
    }}


  private static bool GetFileNameFromHandle (IntPtr handle, out string fileName, int wait) 
    { 
        if (handle == IntPtr.Zero) 
        { 
            fileName = string.Empty; 
            return false; 
        }

        Task task = Application.Current.Dispatcher.BeginInvoke(DispatcherPriority.Background, new Action(GetFileNameFromHandle)); 
        bool bRes = task.Wait(wait); 
        if (bRes) 
        { 
            FileNameFromHandleState state = (FileNameFromHandleState)task.Result; 
            if (state.RetValue) 
            { 
                fileName = state.FileName; 
                return true; 
            }
        } 

        fileName = string.Empty; 
        return false; 
    } 

 private static bool GetFileNameFromHandle (IntPtr handle, out string fileName, int wait) 
    { 
        if (handle == IntPtr.Zero) 
        { 
            fileName = string.Empty; 
            return false; 
        }

        FileNameFromHandleState f = new FileNameFromHandleState (handle); 
        bool bRes = f.WaitOne(wait); 
        if (bRes) 
        { 
            if (f.RetValue) 
            { 
                fileName = f.FileName; 
                return true; 
            }
        } 

        fileName = string.Empty; 
        return false; 
    } 

 private static bool GetFileNameFromHandle (IntPtr handle, out string fileName, int wait) 
    { 
        if (handle == IntPtr.Zero) 
        { 
            fileName = string.Empty; 
            return false; 
        }

        ManualResetEvent ev = new ManualResetEvent(false); 
        FileNameFromHandleState f = new FileNameFromHandleState (handle, ev); 
        ThreadPool.QueueUserWorkItem (new WaitCallback (GetFileNameFromHandle), f);
        bool bRes = ev.WaitOne(wait); 
        if (bRes) 
        { 
            if (f.RetValue) 
            { 
                fileName = f.FileName; 
                return true; 
            }
        } 

        fileName = string.Empty; 
        return false; 
    } 

 private static bool GetFileNameFromHandle (IntPtr handle, out string fileName, int wait) 
{ 
    if (handle == IntPtr.Zero) 
    { 
        fileName = string.Empty; 
        return false; 
    }

    ManualResetEvent ev = new ManualResetEvent(false); 
    FileNameFromHandleState f = new FileNameFromHandleState (handle, ev); 
    ThreadStart threadStart = new ThreadStart(GetFileNameFromHandle); 
    Thread thread = new Thread(threadStart); 
    thread.Start(); 
    bool bRes = ev.WaitOne(wait); 
    if (bRes) 
    { 
        if (f.RetValue) 
        { 
            fileName = f.FileName; 
            return true; 
        }
    } 

    fileName = string.Empty; 
    return false; 
} 


