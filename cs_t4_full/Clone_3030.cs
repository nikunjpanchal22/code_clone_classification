public static void DeleteEmptyDirs (this DirectoryInfo dir) {
    foreach (DirectoryInfo d in dir.GetDirectories ())
        d.DeleteEmptyDirs ();
    try {
        dir.Delete ();
    }
    catch (IOException) {
    }
    catch (UnauthorizedAccessException) {
    }
}




public static void DeleteEmptyDirs (this DirectoryInfo dir) {
    var dirs = dir.GetDirectories();
    foreach (var d in dirs) {
        if(d.GetDirectories().Length == 0 && d.GetFiles().Length == 0) {
            d.Delete();
        } else {
            d.DeleteEmptyDirs();
        }
    }
}


