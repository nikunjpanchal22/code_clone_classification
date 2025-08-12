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

        Bitmap bitmap = null;

        var width = src.PixelWidth;
        var height = src.PixelHeight;

        int size = src.GetPixelBytesPerRow();

        int newWidth = src.PixelWidth;
        int newHeight = src.PixelHeight;

        int dataSize = width * height * 4;
        byte[] pixels = new byte[dataSize];

        int stride = dataSize / height;

        try 
        {
            for (int y = 0; y < newHeight; y++) 
            {
                int index = stride * y;
                for (int x = 0; x < newWidth; x+=4) 
                {
                    pixels[index + x]     = src.PixelBuffer[index + x + 2];
                    pixels[index + x + 1] = src.PixelBuffer[index + x + 1];
                    pixels[index + x + 2] = src.PixelBuffer[index + x];
                    pixels[index + x + 3] = src.PixelBuffer[index + x + 3];
                }
            }

            bitmap = new Bitmap(width, height, stride, System.Drawing.Imaging.PixelFormat.Format32bppArgb, Marshal.UnsafeAddrOfPinnedArrayElement(pixels, 0));
        } 
        catch 
        {
            bitmap = null;
        }

        return bitmap;
}


