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
        FileStream fs = new FileStream(Path.GetFullPath(filePath), FileMode.Open, FileAccess.Read);
        Image i = Image.FromStream(fs);
        Set(i, style);
        Success = true;
    }
    catch {
    }
    return Success;
}
