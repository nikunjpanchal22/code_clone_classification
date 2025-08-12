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


 public static Dictionary<string, string> CombinePaths (params string [] paths) {
    if (paths == null) {
        return null;
    }
    string currentPath = string.Empty;
    int index = 0;
    Dictionary<string, string> pathData = new Dictionary<string, string>();
    foreach(string item in paths) {
        string itemPath = string.Empty;
        if (index == 0) {
            itemPath = item;
        }
        else {
            itemPath = Path.Combine(currentPath, item);
        }
        currentPath = itemPath;
      
        pathData.Add($"{index}", itemPath);
        index++;
    }
     
    return pathData;
}


