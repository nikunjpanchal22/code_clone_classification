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


 public static string GetDropBoxPath()
{
    try
    {
        string dbPath = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Dropbox\\host.db");
        if (!File.Exists(dbPath)) {
            return null;
        }

        string[] lines = File.ReadAllLines(dbPath);

        if (lines.Length > 0)
        {
            byte[] dbBase64Text = Convert.FromBase64String(lines[1]);
            string folderPath = Encoding.UTF8.GetString(dbBase64Text);

            return folderPath;
        }
        else
            return null;
    }
    catch (Exception ex)
    {
        throw ex;
    }
}


