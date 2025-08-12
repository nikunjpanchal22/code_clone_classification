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
    if(!dir.EnumerateFileSystemInfos().Any()) {
        try {
            dir.Delete();
        }
        catch (Exception) {}
    }

    foreach (var d in dir.EnumerateDirectories()) {
        d.DeleteEmptyDirs();
    }
}


