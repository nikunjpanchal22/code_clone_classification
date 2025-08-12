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


 public static string CombinePaths (string delimiter, params string [] paths) {
    if (paths == null) {
        return null;
    }

    StringBuilder builder = new StringBuilder();
    foreach (string path in paths)
    {
        builder.Append(path);
        builder.Append(delimiter);
    }
    string combinedPath = builder.ToString();

    if(combinedPath.Length != 0 && delimiter.Length != 0)
    {
        combinedPath = combinedPath.Remove(combinedPath.Length - delimiter.Length);
    }
    return combinedPath;
}


