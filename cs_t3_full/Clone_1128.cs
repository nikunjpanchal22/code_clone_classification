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
    List <Process> processList = new List <Process> ();
    Process currentProc = Process.GetCurrentProcess ();
    logger.LogDebug ("Current proccess: {0}", currentProc.ProcessName);
    Process [] processes = Process.GetProcessesByName (currentProc.ProcessName);
    foreach (Process process in processes) {
        processList.Add (process);
    }
    if (processList.Count > 1) {
        foreach (Process process in processList) {
            if (currentProc.Id != process.Id) {
                logger.LogInformation ("Another instance of this process is already running: {pid}", process.Id);
                return true;
            }
        }
    }
    return false;
}


