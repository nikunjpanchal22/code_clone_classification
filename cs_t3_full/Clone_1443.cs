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
        // Create and init a List of tasks
        List<Task> taskList = new List<Task>();
        taskList.Add(Task.Factory.StartNew(action: () => {
            Process process = new Process();
            process.StartInfo.FileName = "exe1.exe";
            process.Start();
            process.WaitForExit();
        }));
        taskList.Add(Task.Factory.StartNew(action: () => {
            Process process = new Process();
            process.StartInfo.FileName = "exe2.exe";
            process.Start();
            process.WaitForExit();
        }));
        taskList.Add(Task.Factory.StartNew(action: () => {
            Process process = new Process();
            process.StartInfo.FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe";
            process.StartInfo.Arguments = "ps1.ps1";
            process.Start();
            process.WaitForExit();
        }));
        // Wait for all tasks to complete
        Task.WaitAll(taskList.ToArray());
}


