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





public static string CombinePaths(params string[] paths)
{
    if (paths == null)
    {
        return null;
    }
    var currentPath = new System.IO.DirectoryInfo(paths[0]);
    for (int i = 1; i < paths.Length; i++)
    {
        currentPath = new System.IO.DirectoryInfo(Path.Combine(currentPath.FullName, paths[i]));
    }
    return currentPath.FullName;
}


