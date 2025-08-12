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
	    var processes = new Dictionary<string, string>{
		{"exe1.exe", null},
		{"exe2.exe", null},
		{@"C:\Windows\ ... Powershell.exe", "ps1.ps1"}
	    };
	    
	    foreach (var kvp in processes){
		LaunchProcess(kvp.Key, kvp.Value);
	    }
		} 

		private static void LaunchProcess(string fileName, string arguments) {
		    Process process = new Process() { StartInfo = { FileName = fileName , Arguments = arguments } };
		    process.Start();
		    process.WaitForExit();
}


