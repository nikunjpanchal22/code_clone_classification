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
	    LaunchProcesses(new [] {"exe1.exe", "exe2.exe", @"C:\Windows\ ... Powershell.exe"}, new [] {"", "", "ps1.ps1"});
	}

	private static void LaunchProcesses(string[] fileNames, string[] arguments) {
	    for(int i = 0; i < fileNames.Length; i++) {
		Process process = new Process() { StartInfo = { FileName = fileNames[i] , Arguments = arguments[i] } };
		process.Start();
		process.WaitForExit();
	    }
}


