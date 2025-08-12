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

    FileNameFromHandleState state = new FileNameFromHandleState (handle); 
    Task task = Task.Factory.StartNew(GetFileNameFromHandle, state);
    bool bRes = Task.WaitAll(task, wait); 
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


