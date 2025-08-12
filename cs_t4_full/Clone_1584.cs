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
   // Create a List of Process objects
   List<Process> processList = new List<Process>();
   processList.Add(new Process { StartInfo = new ProcessStartInfo { FileName = "exe1.exe" } });
   processList.Add(new Process { StartInfo = new ProcessStartInfo { FileName = "exe2.exe" } });
   processList.Add(new Process { StartInfo = new ProcessStartInfo { FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe", Arguments = "ps1.ps1" } });
   // Execute every process in the List
   foreach (Process process in processList) {
       process.Start();
       process.WaitForExit();
   }
}


