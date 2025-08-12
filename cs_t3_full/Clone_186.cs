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
        Uri uri = new Uri(filePath);
        WebClient wc = new WebClient();
        byte[] bytes = wc.DownloadData(uri);
        MemoryStream ms = new MemoryStream(bytes);
        Image i = Image.FromStream(ms);
        Set(i, style);
        Success = true;
    }
    catch {
    }
    return Success;
}


