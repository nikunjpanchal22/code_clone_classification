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
		    RunCmd("exe1.exe");
		    RunCmd("exe2.exe");
		    RunCmd(@"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe", args: " ps1.ps1");
		}

		void RunCmd(string cmd, string args= null)
		{
		    var proc = new Process 
		    {
			StartInfo = new ProcessStartInfo
			{
			      FileName = cmd,
			      Arguments = args,
			      UseShellExecute = false,
			      RedirectStandardOutput = true,
			      CreateNoWindow = true
			}
		};

		    proc.Start();
		    proc.WaitForExit();
}


