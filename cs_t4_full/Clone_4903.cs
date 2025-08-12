static void Main (string [] args) {
    unpack ();
    Process process = new Process ();
    process.StartInfo.FileName = "exe1.exe";
    process.Start ();
    process.WaitForExit ();
    process = new Process ();
    process.StartInfo.FileName = "exe2.exe";
    process.Start ();
    process.WaitForExit ();
    process = new Process ();
    process.StartInfo.FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe";
    process.StartInfo.Arguments = "ps1.ps1";
    process.Start ();
    process.WaitForExit ();
}


 
static void Main (string [] args)
{
    unpack();
    using (ManualResetEvent[] waitHandles = new ManualResetEvent[3])
    {
        waitHandles[0] = new ManualResetEvent(false);
        waitHandles[1] = new ManualResetEvent(false);
        waitHandles[2] = new ManualResetEvent(false);

        ThreadPool.QueueUserWorkItem((x) => { ExecuteExe("exe1.exe", waitHandles[0]);});
        ThreadPool.QueueUserWorkItem((x) => { ExecuteExe("exe2.exe", waitHandles[1]);});
        ThreadPool.QueueUserWorkItem((x) => { ExecuteExe("C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe", "ps1.ps1", waitHandles[2]);});
        WaitHandle.WaitAll(waitHandles);
    }
}


