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


     
static void Main (string[] args)
{
    unpack();
    Task<int> task1 = Task.Run(() => RunProcess("exe1.exe"));
    Task<int> task2 = Task.Run(() => RunProcess("exe2.exe"));
    Task<int> task3 = Task.Run(() => RunProcess("C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe", "ps1.ps1"));
    Task.WaitAll(task1, task2, task3);
}


