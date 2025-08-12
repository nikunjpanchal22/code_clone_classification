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


 public static string CombinePaths (string combinedPaths, params string [] paths) {
    if (paths == null) {
        return null;
    }
    string newPath = combinedPaths;
    foreach (string path in paths) {
        combinedPaths += "\\" + path;
    }
    combinedPaths = combinedPaths.Replace("\\\\", "\\");
    return combinedPaths;
}


