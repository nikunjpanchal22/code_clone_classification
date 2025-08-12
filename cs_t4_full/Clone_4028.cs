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

    using (var cancellationTokenSource = new CancellationTokenSource())
    {
        Task<FileNameFromHandleState> t = Task.Run(() => GetFileNameFromHandle(handle, cancellationTokenSource.Token), cancellationTokenSource.Token);
        bool bRes = t.Wait(wait);
        if (bRes)
        {
            if (t.Result.RetValue)
            {
                fileName = t.Result.FileName;
                return true;
            }
        }
    }

    fileName = string.Empty; 
    return false; 
} 


