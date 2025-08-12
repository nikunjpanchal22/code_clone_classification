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
    var _bitmap = new Bitmap(bitmapsource.PixelWidth, bitmapsource.PixelHeight); 
    _bitmap.SetResolution(bitmapsource.DpiX, bitmapsource.DpiY); 
 
    var _bitmapData = _bitmap.LockBits(new Rectangle(0, 0, bitmapsource.PixelWidth, bitmapsource.PixelHeight), ImageLockMode.WriteOnly, _bitmap.PixelFormat); 
 
    bitmapsource.CopyPixels(Int32Rect.Empty, _bitmapData.Scan0, _bitmapData.Stride * bitmapsource.PixelHeight, _bitmapData.Stride); 
 
    _bitmap.UnlockBits(_bitmapData); 
 
    return _bitmap; 
} 


