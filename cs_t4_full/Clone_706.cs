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

        IntPtr destinationStride = bitmap.Scan0;
        int stride = src.GetPixelBytesPerRow();

        bitmap.LockBits();

        unsafe 
        {
            byte* sourceData = (byte*)src.PixelBuffer;
            byte* destinationData = (byte*)bitmap.Scan0;

            int height = src.PixelHeight;
            int width = src.PixelWidth;

            for (int y = 0; y < height; ++y)
            {
                for (int x = 0; x < width; ++x, sourceData+=4, destinationData+=4)
                {
                    // copy b,g,r,a
                    // windows returns b,g,r,a while most libraries return a,b,g,r
                    destinationData[0] = sourceData[3];
                    destinationData[1] = sourceData[2];
                    destinationData[2] = sourceData[1];
                    destinationData[3] = sourceData[0];
                }
            }
        }

        bitmap.UnlockBits();

        return bitmap;
}


