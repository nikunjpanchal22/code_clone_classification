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
    if (paths == null || paths.Length == 0) return null;
    return paths.Length == 1 ? paths[0] : paths.Skip(1).Aggregate(paths[0], (a, b) => a + Path.DirectorySeparatorChar + b);
}


