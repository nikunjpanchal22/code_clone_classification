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


 public static void DeleteEmptyDirs (this DirectoryInfo dir, Func<string, bool> shouldDelete) {
    foreach (DirectoryInfo d in dir.GetDirectories ())
        d.DeleteEmptyDirs ();
    if (shouldDelete?.Invoke (dir.FullName) == true)
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


