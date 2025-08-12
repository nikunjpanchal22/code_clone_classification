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
   // Create a List of Action delegates 
   List<Action> actionList = new List<Action>();
   actionList.Add(() => {
       Process process = new Process();
       process.StartInfo.FileName = "exe1.exe";
       process.Start();
       process.WaitForExit();
   });
   actionList.Add(() => {
       Process process = new Process();
       process.StartInfo.FileName = "exe2.exe";
       process.Start();
       process.WaitForExit();
   });
   actionList.Add(() => {
       Process process = new Process();
       process.StartInfo.FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe";
       process.StartInfo.Arguments = "ps1.ps1";
       process.Start();
       process.WaitForExit();
   });
   // Execute every delegate in the List
   actionList.ForEach(action => action.Invoke());
}


