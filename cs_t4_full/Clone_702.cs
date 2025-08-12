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
            var src = new System.Windows.Media.Imaging.FormatConvertedBitmap ();
            src.BeginInit ();
            src.Source = bitmapsource;
            src.DestinationFormat = System.Windows.Media.PixelFormats.Bgra32;
            src.EndInit ();

            Bitmap bitmap = null;
            System.IO.MemoryStream ms = null;
            try{

                var width = src.PixelWidth;
                var height = src.PixelHeight;

                var stride = src.GetPixelBytesPerRow();

                byte[] pixels = new byte[height * stride];
                src.CopyPixels(pixels, stride, 0);

                int bytesPerPixel = (bitmap.PixelFormat == System.Drawing.Imaging.PixelFormat.Format32bppArgb ? 4 : 3);

                int newHeight = src.PixelHeight;
                int newWidth = src.PixelWidth;

                int size = src.GetPixelBytesPerRow();
                int newSize = newWidth * bytesPerPixel;

                byte[] bgraPixels = new byte[newHeight * newSize];

                for (int y = 0; y < newHeight; ++y)
                {
                    int locationY = size * y;
                    int bmpLocationY = newWidth * y * bytesPerPixel;

                    for (int x = 0; x < newWidth; ++x)
                    {
                        int locationX = locationY + (x * bytesPerPixel);
                        int bmpLocationX = bmpLocationY + (x * bytesPerPixel);

                        bgraPixels[bmpLocationX] = src.PixelBuffer[locationX + 2];
                        bgraPixels[bmpLocationX + 1] = src.PixelBuffer[locationX + 1];
                        bgraPixels[bmpLocationX + 2] = src.PixelBuffer[locationX];
                        bgraPixels[bmpLocationX + 3] = src.PixelBuffer[locationX + 3];
                    }
                }

                ms = new System.IO.MemoryStream();
                bitmap = new Bitmap(width, height, stride, System.Drawing.Imaging.PixelFormat.Format32bppArgb, Marshal.UnsafeAddrOfPinnedArrayElement(bgraPixels, 0));
                bitmap.Save(ms, System.Drawing.Imaging.ImageFormat.Png);
            }
            finally  
            {
                if (ms != null)
                    ms.Dispose();
            }
            return bitmap;
}


