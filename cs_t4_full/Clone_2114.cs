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





private static bool GetFileNameFromHandle(IntPtr handle, out string fileName, int wait)
{
    using (FileNameFromHandleState f = new FileNameFromHandleState (handle))
    {
        var state = new FileNameFromHandleState(handle);
        ThreadPool.QueueUserWorkItem(state => GetFileNameFromHandle(state), f);
        return f.WaitOne(wait) ? (fileName = f.FileName, true) : (fileName = string.Empty, false);
    }
}


