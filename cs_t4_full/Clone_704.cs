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


  public Bitmap BitmapFromSource (System.Windows.Media.Imaging.BitmapSource bitmapsource) {
        Bitmap bitmap = Converter.ConvertToBitmap(bitmapsource);

        var data = bitmap.LockBits (new Rectangle (Point.Empty, bitmap.Size), System.Drawing.Imaging.ImageLockMode.WriteOnly, System.Drawing.Imaging.PixelFormat.Format32bppArgb);
        int stride = data.Stride;
        IntPtr scan0 = data.Scan0;
        int width = src.PixelWidth;
        int height = src.PixelHeight;
        int dataSize = width * height * 4;
        byte[] pixels = new byte[dataSize];

        int bytesPerPixel = (bitmap.PixelFormat == System.Drawing.Imaging.PixelFormat.Format32bppArgb ? 4 : 3);
        int newHeight = src.PixelHeight;
        int newWidth = src.PixelWidth;

        int size = src.GetPixelBytesPerRow();
        int newSize = newWidth * bytesPerPixel;

        for (int y = 0; y < newHeight; ++y)
        {
            int locationY = size * y;
            int bmpLocationY = newWidth * y * bytesPerPixel;

            for (int x = 0; x < newWidth; ++x)
            {
                int locationX = locationY + (x * bytesPerPixel);
                int bmpLocationX = bmpLocationY + (x * bytesPerPixel);

                pixels[bmpLocationX] = src.PixelBuffer[locationX + 2];
                pixels[bmpLocationX + 1] = src.PixelBuffer[locationX + 1];
                pixels[bmpLocationX + 2] = src.PixelBuffer[locationX];
                pixels[bmpLocationX + 3] = src.PixelBuffer[locationX + 3];
            }
        }

        Marshal.Copy(src.PixelBuffer, 0, scan0, dataSize);
        bitmap.UnlockBits (data);
        return bitmap;
}


