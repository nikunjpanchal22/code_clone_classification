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
    var dw = (int)bitmapsource.PixelWidth;
    var dh = (int)bitmapsource.PixelHeight;
    var w = dw * dh;
    var dwBytes = (dw + 7) / 8;
    var wb = new byte[dwBytes * dh];
    bitmapsource.CopyPixels(wb, dwBytes, 0);
    var bmp = new Bitmap(dw,dh, PixelFormat.Format32bppArgb);

    var data = bmp.LockBits(new Rectangle(0, 0, dw, dh), ImageLockMode.WriteOnly, PixelFormat.Format32bppArgb);
    var scan0 = data.Scan0;

    for (int y = 0; y < dh; y++)
        BitmapUtilityCopyRow(wb, y * dwBytes, scan0, y *  dwBytes, dwBytes);

    bmp.UnlockBits(data);
    return bmp;
}


