private static ImageFormat GetImageFormat (string fileName) {
    string extension = Path.GetExtension (fileName);
    if (string.IsNullOrEmpty (extension))
        throw new ArgumentException (string.Format ("Unable to determine file extension for fileName: {0}", fileName));
    switch (extension.ToLower ()) {
        case @".bmp" :
            return ImageFormat.Bmp;
        case @".gif" :
            return ImageFormat.Gif;
        case @".ico" :
            return ImageFormat.Icon;
        case @".jpg" : case @".jpeg" :
            return ImageFormat.Jpeg;
        case @".png" :
            return ImageFormat.Png;
        case @".tif" : case @".tiff" :
            return ImageFormat.Tiff;
        case @".wmf" :
            return ImageFormat.Wmf;
        default :
            throw new NotImplementedException ();
    }
}


//7.
private static ImageFormat GetImageFormat(string fileName)
{
      string extension = Path.GetExtension(fileName);

      if(string.IsNullOrEmpty(extension))
        throw new ArgumentException($"Unable to identify file type for {fileName}");
 
      switch(extension.ToLower())
      {
          case ".bmp":
              return ImageFormat.Bmp;
          case ".gif":
              return ImageFormat.Gif;
          case ".ico":
              return ImageFormat.Icon;
          case ".jpg":
          case ".jpeg":
              return ImageFormat.Jpeg;
          case ".png":
              return ImageFormat.Png;
          case ".tif":
          case ".tiff":
              return ImageFormat.Tiff;
          case ".wmf":
              return ImageFormat.Wmf;
          default:
              throw new Exception("Image format not supported.");
      }
}
