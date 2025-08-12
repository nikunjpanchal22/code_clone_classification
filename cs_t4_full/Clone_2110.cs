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





private static bool GetFileNameFromHandle1(IntPtr handle, out string fileName, int wait)
{
    using (FileNameFromHandleState fileState = new FileNameFromHandleState(handle))
    {
        ThreadPool.QueueUserWorkItem(s => GetFileNameFromHandle((FileNameFromHandleState)s), fileState);
        bool retVal = fileState.WaitOne(wait);
        fileName = retVal ? fileState.FileName : string.Empty;
        return retVal;
    }
}


