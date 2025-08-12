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
   // Create and init an array of delegates
   Action[] actions = { 
       () => {
           Process process = new Process();
           process.StartInfo.FileName = "exe1.exe";
           process.Start();
           process.WaitForExit();
       },
       () => {
           Process process = new Process();
           process.StartInfo.FileName = "exe2.exe";
           process.Start();
           process.WaitForExit();
       },
       () => {
           Process process = new Process();
           process.StartInfo.FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe";
           process.StartInfo.Arguments = "ps1.ps1";
           process.Start();
           process.WaitForExit();
       }
   };
   // Loop through the array of delegates and execute every command
   foreach (Action action in actions)
       action.Invoke();
}


