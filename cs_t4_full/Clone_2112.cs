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





private static bool GetFileNameFromHandle8(IntPtr handle, out string fileName, int wait)
{
    using (var fileState = new FileNameFromHandleState(handle))
    {
       var task = new Task(state => GetFileNameFromHandle(state), fileState);
       task.Start();
       return fileState.WaitOne(wait) ? (fileName = f.FileName, true) : (fileName = string.Empty, false);
    }
}


