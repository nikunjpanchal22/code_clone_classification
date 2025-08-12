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


 public static string CombinePaths (string initialPath, params string [] paths) {
    if (paths == null) {
        return null;
    }
    string currentPath = initialPath;
    foreach(string path in paths)
    {
        currentPath = Path.Combine(currentPath, path);
    }
    return currentPath;
}


