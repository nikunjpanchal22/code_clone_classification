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


 public static void DeleteEmptyDirs (this DirectoryInfo dir, string[] directoriesToIgnore, IList<string> deletedDirs) {
    foreach (DirectoryInfo d in dir.GetDirectories ())
        d.DeleteEmptyDirs (directoriesToIgnore, deletedDirs);
    if (!directoriesToIgnore.Contains(dir.Name))
    {
        try {
            dir.Delete ();
            deletedDirs.Add(dir.FullName);
        }
        catch (IOException) {
        }
        catch (UnauthorizedAccessException) {
        }
    }
}


