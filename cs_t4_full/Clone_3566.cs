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
	    var appFolder = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
	    var hostDbFile = appFolder + "\\Dropbox\\host.db";
	    if (File.Exists(hostDbFile)) {
		var linesFromFile = File.ReadAllLines(hostDbFile);
		var base64Decoded = Convert.FromBase64String(linesFromFile[1]);
		return Encoding.UTF8.GetString(base64Decoded);
	    }
	    return null;
}


