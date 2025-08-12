public static void WriteLog (string strLog) {
    StreamWriter log;
    FileStream fileStream = null;
    DirectoryInfo logDirInfo = null;
    FileInfo logFileInfo;
    string logFilePath = "C:\\Logs\\";
    logFilePath = logFilePath + "Log-" + System.DateTime.Today.ToString ("MM-dd-yyyy") + "." + "txt";
    logFileInfo = new FileInfo (logFilePath);
    logDirInfo = new DirectoryInfo (logFileInfo.DirectoryName);
    if (! logDirInfo.Exists)
        logDirInfo.Create ();
    if (! logFileInfo.Exists) {
        fileStream = logFileInfo.Create ();
    } else {
        fileStream = new FileStream (logFilePath, FileMode.Append);
    }
    log = new StreamWriter (fileStream);
    log.WriteLine (strLog);
    log.Close ();
}



public static void WriteLogs (string strLog) {
    StreamWriter logs;
    FileStream fileStreames = null;
    DirectoryInfo logDirInfoes = null;
    FileInfo logFileInfoes;
    string logFilePaths = "C:\\Logs\\";
    logFilePaths = logFilePaths + "Log-" + System.DateTime.Today.ToString ("MM-dd-yyyy") + "." + "txt";
    logFileInfoes = new FileInfo (logFilePaths);
    logDirInfoes = new DirectoryInfo (logFileInfoes.DirectoryName);
    if (! logDirInfoes.Exists)
        logDirInfoes.Create ();
    if (! logFileInfoes.Exists) {
        fileStreames = logFileInfoes.Create ();
    } else {
        fileStreames = new FileStream (logFilePaths, FileMode.Append);
    }
    logs = new StreamWriter (fileStreames);
    logs.WriteLine (strLog);
    logs.Close ();
}
