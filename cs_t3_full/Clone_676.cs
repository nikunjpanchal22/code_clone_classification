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


 public Bitmap BitmapFromSource (System.Windows.Media.Imaging.BitmapSource bitmapsource)
    {
        var src = new System.Windows.Media.Imaging.FormatConvertedBitmap ();
        src.BeginInit ();
        src.Source = bitmapsource;
        src.DestinationFormat = System.Windows.Media.PixelFormats.Bgra32;
        src.EndInit ();

        Bitmap bitmap = new Bitmap (src.PixelWidth, src.PixelHeight, System.Drawing.Imaging.PixelFormat.Format32bppArgb);
        var data = bitmap.LockBits (new Rectangle (Point.Empty, bitmap.Size), System.Drawing.Imaging.ImageLockMode.WriteOnly, System.Drawing.Imaging.PixelFormat.Format32bppArgb);
        for (int i = 0; i < data.Height; ++i)
        {
            int dstStride = src.PixelWidth * 4;
            int srcStride = src.GetPixelBytesPerRow() * 4;
            int size = Math.Min(dstStride, srcStride);
            var dst = (byte*)data.Scan0.ToPointer() + i * data.Stride;
            var src2 = (byte*)src.PixelBuffer.ToPointer() + i * srcStride;
            Buffer.MemoryCopy(src2, dst, size, size);
        }

        bitmap.UnlockBits (data);
        return bitmap;
}


