static void DeleteEmptyDirs (string dir) {
    if (String.IsNullOrEmpty (dir))
        throw new ArgumentException ("Starting directory is a null reference or an empty string", "dir");
    try {
        foreach (var d in Directory.EnumerateDirectories (dir)) {
            DeleteEmptyDirs (d);
        }
        var entries = Directory.EnumerateFileSystemEntries (dir);
        if (! entries.Any ()) {
            try {
                Directory.Delete (dir);
            }
            catch (UnauthorizedAccessException) {
            }
            catch (DirectoryNotFoundException) {
            }
        }
    }
    catch (UnauthorizedAccessException) {
    }
}


static void DeleteEmptyDirectories (string dir) {
    if (String.IsNullOrEmpty (dir)) {
        throw new ArgumentException 
            ("Starting directory is a null reference or an empty string", "dir");
    }
    try {
        foreach (var d in Directory.GetDirectories (dir)) {
            DeleteEmptyDirectories (d);
        }
        if (! Directory.EnumerateFileSystemEntries (dir).Any ()) {
            try {
                Directory.Delete (dir);
            }
            catch (UnauthorizedAccessException) {
            }
            catch (DirectoryNotFoundException) {
            }
        }
    }
    catch (UnauthorizedAccessException) {
    }
}
