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
    var IsSuccess = false;
    if (string.IsNullOrEmpty(filePath)) return false;
   
    try
    {
        using var i = new Bitmap(Path.GetFullPath(filePath));
        Set(i, style);
        IsSuccess = true;
    }
    catch
    {
    }
    return IsSuccess;
}


