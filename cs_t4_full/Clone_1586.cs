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
   // Define and init array of changed ProcessStartInfo objects
   ProcessStartInfo[] processStartInfos = { 
       new ProcessStartInfo { FileName = "exe1.exe" }, 
       new ProcessStartInfo { FileName = "exe2.exe" },
       new ProcessStartInfo { FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe", Arguments = "ps1.ps1" } 
   };
   // Loop through the array of ProcessStartInfo objects and execute every command
   foreach (ProcessStartInfo processStartInfo in processStartInfos) {
       Process process = new Process { StartInfo = processStartInfo };
       process.Start();
       process.WaitForExit();
   }
}


