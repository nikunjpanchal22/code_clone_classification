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
    bool success = false;
    try 
    {
        SystemDrawingImage i = System.Drawing.Image.FromFile(Path.GetFullPath(filePath));
        Set(i, style);
        success = true;
    }
    catch (Exception ex)
    {
        success = false;
    }
    return success;
}
