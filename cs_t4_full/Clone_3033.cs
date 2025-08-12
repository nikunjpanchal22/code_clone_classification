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
    foreach (var d in dir.GetDirectories()) {
        if (d.GetFileSystemInfos().Length == 0) {
            d.Delete();
        }
        else {
            DeleteEmptyDirs(d);
        }
    }
}


