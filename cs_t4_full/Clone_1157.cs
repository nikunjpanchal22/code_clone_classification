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
    string processName = currentProc.ProcessName;
    bool result = false;
    try {
        Process [] processes = Process.GetProcessesByName (processName);
        foreach (Process process in processes) {
            if (currentProc.Id != process.Id) {
                logger.LogInformation ("Another instance of this process is already running: {pid}", process.Id);
                result = true;
            }
        }
    } catch (Exception ex) {
        logger.LogError (ex, "Error in checking for already running process");
    }
    return result;
} 


