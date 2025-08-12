public static string GetFullPath (string fileName) {
    if (File.Exists (fileName))
        return Path.GetFullPath (fileName);
    var values = Environment.GetEnvironmentVariable ("PATH");
    foreach (var path in values.Split (';')) {
        var fullPath = Path.Combine (path, fileName);
        if (File.Exists (fullPath))
            return fullPath;
    }
    return null;
}


  public static string GetFullPath (string fileName) {
    if (File.Exists (fileName))
        return Path.GetFullPath (fileName);
    foreach (string drive in Directory.GetLogicalDrives()) {
        string path = Path.Combine(drive, fileName);
        if (File.Exists (path))
            return path;
    }
    return null;
}


