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
    bool status = false;
    if (!File.Exists(filePath)) 
        return false;
    try
    {
        using var img = System.Drawing.Image.FromFile(filePath);
        Set(img, style);  
        status = true;
    }
    catch {}
    return status;
}


