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


 public static void DeleteEmptyDirs(this DirectoryInfo dir, List<string> directoryNamesToIgnore) {
    foreach (DirectoryInfo d in dir.GetDirectories ())
        d.DeleteEmptyDirs (directoryNamesToIgnore);
    if (!directoryNamesToIgnore.Contains(dir.Name))
    {
        try {
            dir.Delete ();
        }
        catch (IOException) {
        }
        catch (UnauthorizedAccessException) {
        }
    }
}


