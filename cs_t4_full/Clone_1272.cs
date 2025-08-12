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


 public static void WriteLog(string strLog) 
    { 
        string folderName = "C:\\Logs";  
        string fileName = "Log-" + DateTime.Today.ToString ("MM-dd-yyyy") + ".txt";
        string filePath = Path.Combine(folderName, fileName);

        if (!Directory.Exists (folderName)) 
        {
            Directory.CreateDirectory(folderName);
        }

        using (StreamWriter logFile = new StreamWriter(filePath, true))
        {
            logFile.WriteLine(strLog);
        }
}


