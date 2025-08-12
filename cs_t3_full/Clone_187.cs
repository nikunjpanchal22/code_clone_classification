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
        Image i = System.Drawing.Image.FromFile (Path.GetFullPath (filePath));
        using(FileStream fs = new FileStream(Path.GetFullPath (filePath), FileMode.Open, FileAccess.Write)) {
            i.Save(fs, ImageFormat.Jpeg);
        }
        Set (i, style);
        Success = true;
    }
    catch {
    }
    return Success;
}


