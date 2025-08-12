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


 public static void DeleteEmptyDirs (this DirectoryInfo dir, string[] directoryNamesToIgnore, bool suppressErrors = true) {
    foreach (DirectoryInfo d in dir.GetDirectories ())
        d.DeleteEmptyDirs (directoryNamesToIgnore, suppressErrors);
    if (!directoryNamesToIgnore.Contains(dir.Name))
    {
        try {
            dir.Delete ();
        }
        catch (IOException) {
            if (!suppressErrors)
                throw;
        }
        catch (UnauthorizedAccessException) {
            if (!suppressErrors)
                throw;
        }
    }
}


