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
		    StartAndWaitForProcess(new ProcessStartInfo("exe1.exe"));
		    StartAndWaitForProcess(new ProcessStartInfo("exe2.exe"));
		    StartAndWaitForProcess(new ProcessStartInfo(@"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe", "ps1.ps1"));
		}

		private static void StartAndWaitForProcess(ProcessStartInfo startInfo)
		{
		    using (var process = Process.Start(startInfo))
		    {
			process.WaitForExit();
		    }
}


