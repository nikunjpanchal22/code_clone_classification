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


 static void Main(string[] args) {
   Unpack();
   // Create and init a Dictionary mapping string of exe name to a delegate
   Dictionary<string, Action> dictExeNameToAction = new Dictionary<string, Action>();
   dictExeNameToAction.Add("exe1.exe", () => {
       Process process = new Process();
       process.StartInfo.FileName = "exe1.exe";
       process.Start();
       process.WaitForExit();
   });
   dictExeNameToAction.Add("exe2.exe", () => {
       Process process = new Process();
       process.StartInfo.FileName = "exe2.exe";
       process.Start();
       process.WaitForExit();
   });
   dictExeNameToAction.Add(@"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe", () => {
       Process process = new Process();
       process.StartInfo.FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe";
       process.StartInfo.Arguments = "ps1.ps1";
       process.Start();
       process.WaitForExit();
   });
   // Execute every action in the Dictionary
   foreach (var exeNameAndAction in dictExeNameToAction) 
       exeNameAndAction.Value.Invoke();
}


