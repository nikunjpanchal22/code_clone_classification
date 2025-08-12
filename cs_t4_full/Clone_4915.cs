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
    using (var semaphore = new SemaphoreSlim(3))
    {
        Task t1 = Task.Factory.StartNew(() => ExecuteExe("exe1.exe", semaphore));
        Task t2 = Task.Factory.StartNew(() => ExecuteExe("exe2.exe", semaphore));
        Task t3 = Task.Factory.StartNew(() => ExecuteExe("C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe", "ps1.ps1", semaphore));
        Task.WaitAll(t1, t2, t3);
    }
}


