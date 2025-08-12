public Bitmap BitmapFromSource (System.Windows.Media.Imaging.BitmapSource bitmapsource) {
    var src = new System.Windows.Media.Imaging.FormatConvertedBitmap ();
    src.BeginInit ();
    src.Source = bitmapsource;
    src.DestinationFormat = System.Windows.Media.PixelFormats.Bgra32;
    src.EndInit ();
    Bitmap bitmap = new Bitmap (src.PixelWidth, src.PixelHeight, System.Drawing.Imaging.PixelFormat.Format32bppArgb);
    var data = bitmap.LockBits (new Rectangle (Point.Empty, bitmap.Size), System.Drawing.Imaging.ImageLockMode.WriteOnly, System.Drawing.Imaging.PixelFormat.Format32bppArgb);
    src.CopyPixels (System.Windows.Int32Rect.Empty, data.Scan0, data.Height * data.Stride, data.Stride);
    bitmap.UnlockBits (data);
    return bitmap;
}


 public Bitmap BitmapFromSource(System.Windows.Media.Imaging.BitmapSource bitmapsource)
{
    var width = bitmapsource.PixelWidth;
    var height = bitmapsource.PixelHeight;
    var stride = width * (bitmapsource.Format.BitsPerPixel + 7) / 8;
    //bytearray to hold source pixel data
    byte[] pixelData = new byte[stride * height];
    //copy source pixel data to byte array
    bitmapsource.CopyPixels(pixelData, stride, 0);
    //create new bitmap
    Bitmap newBitmap = new Bitmap(width, height);
    //lock bitmap data
    Rectangle rect = new Rectangle(0, 0, width, height);
    System.Drawing.Imaging.BitmapData bData = newBitmap.LockBits(rect, System.Drawing.Imaging.ImageLockMode.WriteOnly, newBitmap.PixelFormat);
    //copy byte array to bitmap
    IntPtr ptr = bData.Scan0;
    Marshal.Copy(pixelData, 0, ptr, pixelData.Length);
    //unlock bitmap data
    newBitmap.UnlockBits(bData);
    return newBitmap;
}


