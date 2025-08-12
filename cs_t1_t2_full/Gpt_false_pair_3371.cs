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



public static void WriteLogsInfo (string strLog) {
    StreamWriter logsInfo;
    FileStream fileStreamesInfo = null;
    DirectoryInfo logDirInfoesInfo = null;
    FileInfo logFileInfoesInfo;
    string logFilePathsInfo = "C:\\Logs\\";
    logFilePathsInfo = logFilePathsInfo + "Log-" + System.DateTime.Today.ToString ("MM-dd-yyyy") + "." + "txt";
    logFileInfoesInfo = new FileInfo (logFilePathsInfo);
    logDirInfoesInfo = new DirectoryInfo (logFileInfoesInfo.DirectoryName);
    if (! logDirInfoesInfo.Exists)
        logDirInfoesInfo.Create ();
    if (! logFileInfoesInfo.Exists) {
        fileStreamesInfo = logFileInfoesInfo.Create ();
    } else {
        fileStreamesInfo = new FileStream (logFilePathsInfo, FileMode.Append);
    }
    logsInfo = new StreamWriter (fileStreamesInfo);
    logsInfo.WriteLine (strLog);
    logsInfo.Close ();
}
