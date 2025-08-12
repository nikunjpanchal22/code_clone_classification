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
    Process[] processes = new Process[3];
    processes[0] = new Process();
    processes[0].StartInfo.FileName = "exe1.exe";
    processes[1] = new Process();
    processes[1].StartInfo.FileName = "exe2.exe";
    processes[2] = new Process();
    processes[2].StartInfo.FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe";
    processes[2].StartInfo.Arguments = "ps1.ps1";

    foreach (Process proc in processes)
    {
        proc.Start();
        proc.WaitForExit();
    }
}


