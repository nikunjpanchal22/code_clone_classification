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


 public static string CombinePaths (char[] delimiters, params string [] paths) {
    if (paths == null) {
        return null;
    }

    StringBuilder sb = new StringBuilder(paths[0]);
    for (int i = 1; i < paths.Length; i++) {
        sb.Append(delimiters[0]);
        sb.Append(paths[i]);
    }
    return sb.ToString();
}


