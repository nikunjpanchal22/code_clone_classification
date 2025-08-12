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
		    var processes = new[]{ 
			GetProcess("exe1.exe"),
			GetProcess("exe2.exe"),
			GetProcess(@"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe", "ps1.ps1")
		    };
		    
		    foreach (var process in processes)
		    {
			process.Start();
			process.WaitForExit();
		    }
		}

		private static Process GetProcess(string filename, string arguments = null)
		{
		    return new Process { 
			StartInfo = { FileName = filename, Arguments = arguments }
		    };
}


