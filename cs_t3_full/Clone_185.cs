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


 public static bool setImage(string filePath, Style style) 
{
    bool success = false;
    try 
    {
        SystemDrawingImage img = System.Drawing.Image.FromFile(Path.GetFullPath(filePath));
        if (img != null)
        {
            setImage(img, style);
            success = true;
        }
    }
    catch (UnauthorizedAccessException ex)
    {
        success = false;
    }
    return success;
}


