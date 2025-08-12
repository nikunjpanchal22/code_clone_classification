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
    foreach (var subdir in dir.GetFileSystemInfos().OfType<DirectoryInfo>()) {
        subdir.DeleteEmptyDirs();
    }

    if (dir.GetFileSystemInfos().Any())
        return;

    dir.Delete();
}


