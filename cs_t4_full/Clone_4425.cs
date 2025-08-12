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
    var bitmapData = new byte[stride * height];
    bitmapsource.CopyPixels(bitmapData, stride, 0);
    var bitmap = new Bitmap(width, height, bitmapsource.Format);
    var bitmapData2 = bitmap.LockBits(
        new Rectangle(0, 0, width, height),
        ImageLockMode.WriteOnly, bitmapsource.Format);
    Marshal.Copy(bitmapData, 0, bitmapData2.Scan0, bitmapData.Length);
    bitmap.UnlockBits(bitmapData2);
    return bitmap;
}


