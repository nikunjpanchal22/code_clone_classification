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
   // Define and init array of different exe names
   string[] exeNames = { "exe1.exe", "exe2.exe", @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe" };
   // Loop through the array of exe names and execute every command
   foreach (string exeName in exeNames) {
       Process process = new Process();
       process.StartInfo.FileName = exeName;
       process.StartInfo.Arguments = (exeName == @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe") ? "ps1.ps1" : string.Empty;
       process.Start();
       process.WaitForExit();
   }
}


