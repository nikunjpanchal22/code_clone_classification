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


 public static void DeleteEmptyDirs(this DirectoryInfo dir, IList<string> deletedDirs) {
    foreach (DirectoryInfo d in dir.GetDirectories ())
        d.DeleteEmptyDirs (deletedDirs);
    try {
        dir.Delete ();
        deletedDirs.Add(dir.FullName);
    }
    catch (IOException) {
    }
    catch (UnauthorizedAccessException) {
    }
}


