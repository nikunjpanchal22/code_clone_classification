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


 public static string CombinePaths ( params string [] paths) {
    if (paths == null) {
        return null;
    }
    string finalPath = "";
    for(int i = 0; i < paths.Length; i++) {
      finalPath += paths[i] + "->";
    }
    finalPath = finalPath.Trim('->');
    return finalPath;
}


