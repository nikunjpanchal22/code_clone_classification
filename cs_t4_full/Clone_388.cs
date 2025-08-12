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
    Process process = new Process { StartInfo = { FileName = @"C:\my test folder\my test.bat"} };
    STARTUPINFO lpStartupInfo = new STARTUPINFO ();
    PROCESS_INFORMATION lpProcessInformation = new PROCESS_INFORMATION ();
    string workingDirectory = @"C:\my test folder\";
    int result = CreateProcess(null, process.StartInfo.FileName, null, null, true, 0, IntPtr.Zero, workingDirectory, lpStartupInfo, lpProcessInformation);
    if(result == 0) {
        process.Start();
    }
    string arguments = "";
    process.StartInfo.Arguments = arguments;

}


