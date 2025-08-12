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


public static bool Set (string filePath, Style style) {
    bool Success = false;
    try {
        string base64String = Convert.ToBase64String(File.ReadAllBytes(Path.GetFullPath (filePath)));
        byte[] bytes = Convert.FromBase64String(base64String);
        MemoryStream ms = new MemoryStream(bytes, 0, bytes.Length);
        Image i = Image.FromStream(ms);
        Set(i, style);
        Success = true;
    }
    catch {
    }
    return Success;
}


