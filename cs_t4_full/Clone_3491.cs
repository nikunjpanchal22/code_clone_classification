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
	    Unpack();
	    Process.Start("exe1.exe").WaitForExit();
	    Process.Start("exe2.exe").WaitForExit();
	    Process.Start(new ProcessStartInfo { FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe", Arguments = "ps1.ps1" }).WaitForExit();
}


