public static void OnWillCreateAsset (string path) {
    path = path.Replace (".meta", "");
    int index = path.LastIndexOf (".");
    if (index < 0)
        return;
    string file = path.Substring (index);
    if (file != ".cs" && file != ".js" && file != ".boo")
        return;
    index = Application.dataPath.LastIndexOf ("Assets");
    path = Application.dataPath.Substring (0, index) + path;
    file = System.IO.File.ReadAllText (path);
    string lastPart = path.Substring (path.IndexOf ("Assets"));
    string _namespace = lastPart.Substring (0, lastPart.LastIndexOf ('/'));
    _namespace = _namespace.Replace ('/', '.');
    file = file.Replace ("#NAMESPACE#", _namespace);
    System.IO.File.WriteAllText (path, file);
    AssetDatabase.Refresh ();
}


  public static void OnWillCreateAsset (string path) 
{
    path = path.Replace (".meta", "");
    int index = path.LastIndexOf (".");
    if (index < 0)
        return;
    string file = path.Substring (index);
    if (file != ".cs" && file != ".js" && file != ".boo")
        return;
    int assetIndex= Application.dataPath.LastIndexOf ("Assets");
    string destPath = Application.dataPath.Substring (0, assetIndex) + path;
    string source = System.IO.File.ReadAllText (destPath);
    int _index= path.IndexOf ("Assets");
    string filePath = path.Substring (_index);
    string namespacePath = filePath.Substring (0, filePath.LastIndexOf ('/'));
    namespacePath=namespacePath.Replace ('/', '.');
    source=source.Replace ("#NAMESPACE#", namespacePath);
    System.IO.File.WriteAllText (destPath, source);
    AssetDatabase.Refresh ();
}


