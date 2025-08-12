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
    dir.GetDirectories().ToList().ForEach(d => {
        if(d.EnumerateFileSystemInfos().Any()) {
            d.DeleteEmptyDirs();
        }
    });

    dir.Delete();
}


