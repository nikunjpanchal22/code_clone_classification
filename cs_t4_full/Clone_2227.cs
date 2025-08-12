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
    try
    {
        Bitmap bitmap = (Bitmap)Image.FromFile(filePath);
        Set (bitmap, style);
    }
    catch (Exception)
    {
        return false;
    }
    return true;
}


