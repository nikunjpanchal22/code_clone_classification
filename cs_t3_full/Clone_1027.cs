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


 public static void DeleteEmptyDirs (this DirectoryInfo dir, Action<string> onDirDeleted) {
    foreach (DirectoryInfo d in dir.GetDirectories ())
        d.DeleteEmptyDirs ();
    try {
        dir.Delete ();
        onDirDeleted?.Invoke (dir.FullName);
    }
    catch (IOException) {
    }
    catch (UnauthorizedAccessException) {
    }
}


