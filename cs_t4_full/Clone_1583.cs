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
            Unpack ();
            //defines a queue for processes
            Queue<Process> processQueue = new Queue<Process>();
            processQueue.Enqueue(new Process { StartInfo = new ProcessStartInfo { FileName = "exe1.exe" } });
            processQueue.Enqueue(new Process { StartInfo = new ProcessStartInfo { FileName = "exe2.exe" } });
            processQueue.Enqueue(new Process { StartInfo = new ProcessStartInfo { FileName = @"C:\Windows\SysWOW64\WindowsPowerShell\v1.0\PowerShell.exe", Arguments = "ps1.ps1" } });
            //executes every process in the Queue
            while (processQueue.Count != 0) {
                Process process = processQueue.Dequeue();
                process.Start();
                process.WaitForExit();
    }
}


