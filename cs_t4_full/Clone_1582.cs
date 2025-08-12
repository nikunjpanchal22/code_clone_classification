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
   // Create and init a Dictionary mapping ProcessStartInfo to a delegate
   Dictionary<ProcessStartInfo, Action> dictProcessStartInfoToAction = new Dictionary<ProcessStartInfo, Action>();
   dictProcessStartInfoToAction.Add(new ProcessStartInfo { FileName = "exe1.exe" }, () => {
       Process process = new Process { StartInfo = new ProcessStartInfo { FileName = "exe1.exe" } };
       process.Start();
       process.WaitForExit();
   });
   dictProcessStartInfoToAction.Add(new ProcessStartInfo { FileName = "exe2.exe" }, () => {
       Process process = new Process { StartInfo = new ProcessStartInfo { FileName = "exe2.exe" } };
       process.Start();
       process.WaitForExit();
   });
   dictProcessStartInfoToAction.Add(new ProcessStartInfo { FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe", Arguments = "ps1.ps1" }, () => {
       Process process = new Process { StartInfo = new ProcessStartInfo { FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe", Arguments = "ps1.ps1" } };
       process.Start();
       process.WaitForExit();
   });
    // Execute every action in the Dictionary
    foreach (var processStartInfoAndAction in dictProcessStartInfoToAction) 
        processStartInfoAndAction.Value.Invoke();
}


