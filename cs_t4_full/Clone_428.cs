public static string CombinePaths (params string [] paths) {
    if (paths == null) {
        return null;
    }
    string currentPath = paths [0];
    for (int i = 1; i < paths.Length; i ++) {
        currentPath = Path.Combine (currentPath, paths [i]);
    }
    return currentPath;
}


 public static string CombinePaths (string firstPath, params string [] paths) {
    if (paths == null) {
        return null;
    }
    StringBuilder sb = new StringBuilder(firstPath);
    foreach(string path in paths)
    {
    sb.Append(path);
    sb.Append("\\");
    }
    return sb.ToString().Replace("\\\\", "\\");
}


