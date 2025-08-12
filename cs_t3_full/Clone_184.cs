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


 public static bool SetImage(string filePath, Style style)
 {
     bool success = false;
     try
     {
         Image img = System.Drawing.Image.FromFile(Path.GetFullPath(filePath));
         if(img != null)
         {
             SetImage(img, style);
             success = true;
         }
     }
     catch (ArgumentException ex)
     {
         success = false;
     }
     return success;
}


