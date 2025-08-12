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

    SpinLock resetEvent = new SpinLock(); 
    FileNameFromHandleState state = new FileNameFromHandleState(handle, resetEvent); 
    ThreadPool.QueueUserWorkItem(GetFileNameFromHandle, state);
    bool bRes = false; 
    resetEvent.Enter(ref bRes); 
    if (bRes) 
    { 
        if (state.RetValue) 
        { 
            fileName = state.FileName; 
            return true; 
        } 
    }   

    fileName = string.Empty; 
    return false; 
}


