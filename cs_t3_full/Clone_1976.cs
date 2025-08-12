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
    bool styleSet = false;
    try 
    {
        Image imageSet = Bitmap.FromFile(filePath);
        Set(imageSet, style);
        styleSet = true;
    } 
    catch (Exception) {
        styleSet = false;
    }
    return styleSet;
}


