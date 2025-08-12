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
        var appData = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
        var missingDbPath = Path.Combine(appData, "Dropbox\\host.db");
        if (!File.Exists(missingDbPath)) {
            return null;
        }
        else {
            var linesFromDb = File.ReadAllLines(missingDbPath);
            var base64Result = Convert.FromBase64String(linesFromDb[1]);
            var pathOfFolder = Encoding.UTF8.GetString(base64Result);
            return pathOfFolder;
        }
    }
    catch (Exception ex) {
        throw ex;
    }
}
