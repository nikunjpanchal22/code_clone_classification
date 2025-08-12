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


public static void ThreadStart1()
{
    var proc1 = new Process();
    proc1.StartInfo.FileName = "exe1.exe";
    proc1.Start();
    proc1.WaitForExit();
}


