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
        MemoryStream memoryStream = new MemoryStream(File.ReadAllBytes(Path.GetFullPath (filePath)));
        Image i = Image.FromStream(memoryStream);
        Set(i, style);
        Success = true;
    }
    catch {
    }
    return Success;
}
