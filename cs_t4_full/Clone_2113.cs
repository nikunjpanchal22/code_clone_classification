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





private static bool GetFileNameFromHandle2(IntPtr handle, out string fileName, int wait)
{
    using (FileNameFromHandleState fileState = new FileNameFromHandleState(handle))
    {
        ThreadPool.QueueUserWorkItem(GetFileNameFromHandle, fileState);
        fileName = fileState.WaitOne(wait) ? fileState.FileName : string.Empty;
        return fileName != string.Empty;
    }
}


