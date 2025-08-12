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


 public static void DeleteEmptyDirs(this DirectoryInfo dir, ref int totalDeletedDirs) {
    foreach (DirectoryInfo d in dir.GetDirectories ())
        d.DeleteEmptyDirs (ref totalDeletedDirs);
    try {
        dir.Delete ();
        totalDeletedDirs++;
    }
    catch (IOException) {
    }
    catch (UnauthorizedAccessException) {
    }
}


