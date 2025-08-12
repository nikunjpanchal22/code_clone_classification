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
    var fileExists = File.Exists(filePath);
    if (!fileExists) return false;

    try
    {
        Image image = Image.FromFile(filePath);
        Set(image, style);
        return true;
    }
    catch
    {
        return false;
    }
}


