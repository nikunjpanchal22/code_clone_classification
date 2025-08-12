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





private static Task<bool> GetFileNameFromHandle6(IntPtr handle, out string fileName, int wait)
{
    return Task.Run(() =>
    {
       using (var fileState = new FileNameFromHandleState(handle))
       {
          ThreadPool.QueueUserWorkItem(state => GetFileNameFromHandle(state), fileState);
          bool result = fileState.WaitOne(wait);
          fileName = result ? fileState.FileName : string.Empty;
          return result;
       }
    });
}


