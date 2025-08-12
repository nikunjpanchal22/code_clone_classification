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



public static bool Set(string filePath, Style style)
{
    bool isOK = false;
    if (string.IsNullOrEmpty(filePath)) return false;
    
    try {
        var img = System.Drawing.Image.FromFile(filePath);
        Set(img, style);
        isOK = true;
    }
    catch {
    }
    return isOK;
}


