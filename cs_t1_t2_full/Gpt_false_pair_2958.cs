public void Run () {
    System.Diagnostics.ProcessStartInfo ps = new System.Diagnostics.ProcessStartInfo ();
    ps.FileName = "netstat";
    ps.ErrorDialog = false;
    ps.Arguments = "-e 5";
    ps.CreateNoWindow = true;
    ps.UseShellExecute = false;
    ps.RedirectStandardOutput = true;
    ps.WindowStyle = System.Diagnostics.ProcessWindowStyle.Hidden;
    using (System.Diagnostics.Process proc = new System.Diagnostics.Process ())
    {
        proc.StartInfo = ps;
        proc.EnableRaisingEvents = true;
        proc.Exited += new EventHandler (proc_Exited);
        proc.OutputDataReceived += new System.Diagnostics.DataReceivedEventHandler (proc_OutputDataReceived);
        proc.Start ();
        proc.BeginOutputReadLine ();
        proc.WaitForExit ();
    }}


#====================
#gpt output=============

//Type 3
public void Run () {
    System.Diagnostics.Process myProcess = new System.Diagnostics.Process();
    myProcess.StartInfo.FileName = "netstat";
    myProcess.StartInfo.Arguments = "-e 5";
    myProcess.StartInfo.UseShellExecute = false;
    myProcess.StartInfo.RedirectStandardOutput = true;
    myProcess.StartInfo.CreateNoWindow = true;
    myProcess.StartInfo.WindowStyle = System.Diagnostics.ProcessWindowStyle.Hidden;
    myProcess.EnableRaisingEvents = true;
    myProcess.Exited += new EventHandler(proc_Exited);
    myProcess.OutputDataReceived += new System.Diagnostics.DataReceivedEventHandler(proc_OutputDataReceived);
    myProcess.Start();
    myProcess.BeginOutputReadLine();
    myProcess.WaitForExit();
}


public void Run () {
    System.Diagnostics.Process p = new System.Diagnostics.Process ();
    p.StartInfo.FileName = "netstat";
    p.StartInfo.ErrorDialog = false;
    p.StartInfo.Arguments = "-e 5";
    p.StartInfo.CreateNoWindow = true;
    p.StartInfo.UseShellExecute = false;
    p.StartInfo.RedirectStandardOutput = true;
    p.StartInfo.WindowStyle = System.Diagnostics.ProcessWindowStyle.Hidden;
    p.EnableRaisingEvents = true;
    p.Exited += new EventHandler (proc_Exited);
    p.OutputDataReceived += new System.Diagnostics.DataReceivedEventHandler (proc_OutputDataReceived);
    p.Start ();
    p.BeginOutputReadLine ();
    p.WaitForExit ();
}
