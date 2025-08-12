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
    if (paths == null) return null;
    return paths.Skip(1).Aggregate(new StringBuilder(paths[0]), (sb, path) => sb.Append(Path.DirectorySeparatorChar + path)).ToString();
}


