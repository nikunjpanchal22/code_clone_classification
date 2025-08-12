private static bool AlreadyRunning () {
    Process [] processes = Process.GetProcesses ();
    Process currentProc = Process.GetCurrentProcess ();
    logger.LogDebug ("Current proccess: {0}", currentProc.ProcessName);
    foreach (Process process in processes) {
        if (currentProc.ProcessName == process.ProcessName && currentProc.Id != process.Id) {
            logger.LogInformation ("Another instance of this process is already running: {pid}", process.Id);
            return true;
        }
    }
    return false;
}


  private static bool AlreadyRunning () {
    Process currentProc = Process.GetCurrentProcess ();
    logger.LogDebug ("Current proccess: {0}", currentProc.ProcessName);
    Process [] processes = Process.GetProcessesByName (currentProc.ProcessName);
    List <int> processIds = new List <int> ();
    foreach (Process process in processes) {
        processIds.Add (process.Id);
    }
    if (processIds.Count > 1) {
        if (processIds.Contains (currentProc.Id)) {
            for (int i = 0; i < processes.Length; i++) {
                if (processes [i].Id == currentProc.Id) {
                    continue;
                }
                else {
                    logger.LogInformation ("Another instance of this process is already running: {pid}", processes [i].Id);
                    return true;
                }
            }
        }
    }
    return false;
}


