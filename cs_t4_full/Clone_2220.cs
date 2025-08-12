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
    var isSuccess = false;
    if(File.Exists(filePath))
    {
        using var img = System.Drawing.Image.FromFile(filePath);
        Set(img, style);
        isSuccess = true;
    }
     
    return isSuccess;
}


