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


public static string GetDropBoxPath () {
    try {
        var appDataPath = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
        var dbPath = Path.Combine(appDataPath, "Dropbox\\host.db");
        if (!File.Exists(dbPath)) {
            return null;
        }
        else {
            var dbMissingLines = File.ReadAllLines(dbPath);
            var decodeBase64 = Convert.FromBase64String(dbMissingLines[1]);
            var folderPath = Encoding.UTF8.GetString(decodeBase64);
            return folderPath;
        }
    }
    catch (Exception ex) {
        throw ex;
    }
}
