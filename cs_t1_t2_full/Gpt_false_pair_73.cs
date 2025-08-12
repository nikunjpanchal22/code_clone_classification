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
    string[] paths = Directory.GetFiles(Environment.SpecialFolder.ProgramFilesX86);
    foreach (var path in paths) {
        var fullPath = Path.Combine (path, fileName);
        if (File.Exists (fullPath))
            return fullPath;
    }
    return null;
}
