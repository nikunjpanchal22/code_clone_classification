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





private static bool GetFileNameFromHandle3(IntPtr handle, out string fileName, int wait)
{
    using (FileNameFromHandleState fileState = new FileNameFromHandleState(handle))
    {
        ThreadPool.QueueUserWorkItem(state => GetFileNameFromHandle(state), fileState);
        if (fileState.WaitOne(wait))
        {
            fileName = fileState.FileName;
            return true;
        }
        fileName = string.Empty;
        return false;
    }
}


