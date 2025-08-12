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


 public static void DeleteEmptyDirs(this DirectoryInfo dir, string[] directoriesToIgnore, ref int totalDeletedDirs) {
    foreach (DirectoryInfo d in dir.GetDirectories ())
        d.DeleteEmptyDirs (directoriesToIgnore, ref totalDeletedDirs);
    if (!directoriesToIgnore.Contains(dir.Name))
    {
        try {
            dir.Delete ();
            totalDeletedDirs++;
        }
        catch (IOException) {
        }
        catch (UnauthorizedAccessException) {
        }
    }
}


