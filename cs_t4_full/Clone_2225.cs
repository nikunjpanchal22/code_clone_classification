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
        using (FileStream fs = new FileStream(filePath, FileMode.Open))
        {
            Image img = Image.FromStream(fs);
            Set(img, style);
        }
        return true;
    }
    catch (Exception)
    {
        return false;
    }
}


