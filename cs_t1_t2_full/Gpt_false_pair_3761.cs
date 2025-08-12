static private string ProcessExecutablePath (Process process) {
    try {
        return process.MainModule.FileName;
    }
    catch {
        string query = "SELECT ExecutablePath, ProcessID FROM Win32_Process";
        ManagementObjectSearcher searcher = new ManagementObjectSearcher (query);
        foreach (ManagementObject item in searcher.Get ()) {
            object id = item ["ProcessID"];
            object path = item ["ExecutablePath"];
            if (path != null && id.ToString () == process.Id.ToString ()) {
                return path.ToString ();
            }
        }
    }
    return "";
}


static private string ProcessExecutablePath (Process process) {
    try {
        return process.MainModule.FileName;
    }
    catch {
        string query = "SELECT CommandLine, ProcessID FROM Win32_Process";
        ManagementObjectSearcher searcher = new ManagementObjectSearcher (query);
        foreach (ManagementObject item in searcher.Get ()) {
            object id = item ["ProcessID"];
            object line = item ["CommandLine"];
            if (line != null && id.ToString () == process.Id.ToString ()) {
                return line.ToString ();
            }
        }
    }
    return "";
}
