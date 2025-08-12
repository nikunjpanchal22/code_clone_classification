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
        FileStream fs = null; 
        StreamWriter swLog = null;
        string logFilePath = Path.Combine("C:\\Logs\\Log-" + System.DateTime.Today.ToString ("MM-dd-yyyy") + "." + "txt");
        DirectoryInfo diLogDir = new DirectoryInfo(logFilePath);

        if(!diLogDir.Exists) 
        { 
            diLogDir.Create(); 
        }

        fs = File.Open(logFilePath, FileMode.Append);
        swLog = new StreamWriter(fs); 
        swLog.WriteLine(strLog); 
        swLog.Close(); 
}


