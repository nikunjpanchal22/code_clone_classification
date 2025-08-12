static void Main (string [] args) {
    Process process = new Process ();
    process.StartInfo.FileName = @"C:\my test folder\my test.bat";
    StringBuilder cmdLine = new StringBuilder ();
    cmdLine.Append (process.StartInfo.FileName);
    STARTUPINFO lpStartupInfo = new STARTUPINFO ();
    PROCESS_INFORMATION lpProcessInformation = new PROCESS_INFORMATION ();
    string workingDirectory = @"C:\my test folder\";
    CreateProcess (null, cmdLine, null, null, true, 0, IntPtr.Zero, workingDirectory, lpStartupInfo, lpProcessInformation);
}


static void Main (string [] args) {
    Process process = new Process ();
    process.StartInfo.FileName = @"C:\my test folder\my test.bat";
    StringBuilder cmdLine = new StringBuilder ();
    cmdLine.Append (process.StartInfo.FileName);
    Environment.SetEnvironmentVariable ("comspec", @"C:\my test folder\my test.bat");
    ProcessStartInfo lpStartupInfo = new ProcessStartInfo ();
    PROCESS_INFORMATION lpProcessInformation = new PROCESS_INFORMATION ();
    string workingDirectory = @"C:\my test folder\";
    Process.Start (lpStartupInfo);
}
