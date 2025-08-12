public static bool Set (string filePath, Style style) {
    bool Success = false;
    try {
        Image i = System.Drawing.Image.FromFile (Path.GetFullPath (filePath));
        Set (i, style);
        Success = true;
    }
    catch {
    }
    return Success;
}


 public static bool Set (string filePath, Style style) {
    bool Success = false;
    try {
        Assembly assembly = Assembly.GetExecutingAssembly();
        Image i = Image.FromStream(assembly.GetManifestResourceStream(filePath));
        Set(i, style);
        Success = true;
    }
    catch {
    }
    return Success;
}
