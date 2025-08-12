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
        string query = "SELECT Name, Handle FROM Win32_Process";
        ManagementObjectSearcher searcher = new ManagementObjectSearcher (query);
        foreach (ManagementObject item in searcher.Get ()) {
            object handle = item ["Handle"];
            object name = item ["Name"];
            if (name != null && handle.ToString () == process.Id.ToString ()) {
                return name.ToString ();
            }
        }
    }
    return "";
}
