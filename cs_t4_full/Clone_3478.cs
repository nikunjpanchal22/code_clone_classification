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





static void Main (string [] args) {
		    Unpack();
		    var process1 = StartProcess("exe1.exe");
		    var process2 = StartProcess("exe2.exe");
		    var process3 = StartProcess(@"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\powershell.exe", "ps1.ps1");

		    WaitForProcess(process1);
		    WaitForProcess(process2);
		    WaitForProcess(process3);
		}

		public static Process StartProcess(string path, string arguments = "")
		{
		    var process = new Process();
		    process.StartInfo.FileName = path;
		    process.StartInfo.Arguments = arguments;
		    process.Start();
		    return process;
		}

		public static void WaitForProcess(Process process)
		{
		    process.WaitForExit();
}


