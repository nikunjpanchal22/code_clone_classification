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


 public static void WriteLog (string strLog)
    {
        string logFilePath = Path.Combine("C:\\Logs\\Log-" + System.DateTime.Today.ToString ("MM-dd-yyyy") + "." + "txt");

        FileStream fs = File.Open(logFilePath, FileMode.Append);
        StreamWriter swLog = new StreamWriter(fs); 
        swLog.WriteLine(strLog); 
        swLog.Flush();
        swLog.Close();
        fs.Close(); 
}


