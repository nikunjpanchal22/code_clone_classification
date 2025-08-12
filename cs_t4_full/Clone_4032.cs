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

    AutoResetEvent resetEvent = new AutoResetEvent(false); 
    FileNameFromHandleState state = new FileNameFromHandleState(handle, resetEvent); 
    ThreadPool.QueueUserWorkItem(GetFileNameFromHandle, state);
    bool bRes = resetEvent.WaitOne(wait);
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


