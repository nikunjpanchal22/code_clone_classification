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





private static bool GetFileNameFromHandle7(IntPtr handle, out string fileName, int wait, Action callback)
{
    using (var fileState = new FileNameFromHandleState(handle))
    {
       ThreadPool.QueueUserWorkItem(state => 
       {
           GetFileNameFromHandle(state);
           callback();
       }, fileState);
    }
}


