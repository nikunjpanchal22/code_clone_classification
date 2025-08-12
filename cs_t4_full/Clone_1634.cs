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


	public static string GetDropboxDirectory()
        {
            try
            {
                string userDirectory = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
                string dbPath = Path.Combine(userDirectory, "Dropbox\\host.db");

                if (!File.Exists(dbPath))
                    return null;

                string[] dbContent = File.ReadAllLines(dbPath);
                byte[] base64Text = Convert.FromBase64String(dbContent[1]);
                string dropboxPath = Encoding.UTF8.GetString(base64Text);
                return dropboxPath;
            }
            catch (Exception ex)
            {
                throw ex;
            }
}


