public static string getDropBoxPath () {
    try {
        var appDataPath = Environment.GetFolderPath (Environment.SpecialFolder.LocalApplicationData);
        var dbPath = Path.Combine (appDataPath, "Dropbox\\host.db");
        if (! File.Exists (dbPath)) {
            return null;
        } else {
            var lines = File.ReadAllLines (dbPath);
            var dbBase64Text = Convert.FromBase64String (lines [1]);
            var folderPath = Encoding.UTF8.GetString (dbBase64Text);
            return folderPath;
        }
    }
    catch (Exception ex) {
        throw ex;
    }
}




public static string getDropBoxPath() {
	    string strPath = Environment.GetFolderPath (Environment.SpecialFolder.LocalApplicationData);
	    string strDB = Path.Combine (strPath, "Dropbox\\host.db");
	    if (! File.Exists(strDB)) return null;
	    string[] arrLines = File.ReadAllLines(strDB);
	    byte[] arrBytes = Convert.FromBase64String (arrLines [1]);
	    return Encoding.UTF8.GetString(arrBytes);
}


