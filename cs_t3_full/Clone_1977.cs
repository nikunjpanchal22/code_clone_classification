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
    bool IsSuccess;
    try {
        Image image = Image.FromStream(new MemoryStream(File.ReadAllBytes(filePath)));
        Set (image, style);
        IsSuccess = true;
    }
    catch {
        IsSuccess = false;
    }
    return IsSuccess;
}


