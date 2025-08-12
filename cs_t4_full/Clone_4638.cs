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
    DirectoryInfo [] dirs = dir.GetDirectories ();
    foreach (DirectoryInfo d in dirs) {
        d.DeleteEmptyDirs ();
    }
    dir.Delete (true);
}


