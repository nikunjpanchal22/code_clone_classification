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





private async static Task<bool> GetFileNameFromHandle9(IntPtr handle, string fileName, int wait)
{
    using (var fileState = new FileNameFromHandleState(handle))
    {
       await Task.Factory.StartNew(state => GetFileNameFromHandle(state), fileState);
       return fileState.WaitOne(wait) ? (fileName = fileState.FileName, true) : (fileName = string.Empty, false);
    }
}


