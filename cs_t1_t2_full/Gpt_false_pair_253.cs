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
        Image i = System.Drawing.Image.FromFile(Path.GetFullPath(filePath));
        Set(i, style);
        success = true;
    }
    catch (IOException )
    {
        success = false;
    }
    return success;
}
