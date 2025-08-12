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


public static void ExecuteExe(string fileName, ManualResetEvent waitHandle, string Arguments = "")
{
    Process process = new Process
    {
        StartInfo = { FileName = fileName, Arguments = Arguments }
    };
    process.Start();
    process.WaitForExit();
    waitHandle.Set();
}


