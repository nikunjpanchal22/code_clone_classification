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

            var stride = src.GetPixelBytesPerRow();

            int newHeight = src.PixelHeight;
            int newWidth = src.PixelWidth;

            int bmpwidth = src.PixelWidth;
            int bmpheight = src.PixelHeight;

            byte[] bgraPixels = new byte[newHeight * newWidth * 4];

            for (int y = 0; y < newHeight; y++)
            {
                for (int x = 0; x < newWidth; x++)
                {
                    int index = (y * bmpwidth + x) * 4;
                    bgraPixels[index] = src.PixelBuffer[index + 3];
                    bgraPixels[index + 1] = src.PixelBuffer[index + 2];
                    bgraPixels[index + 2] = src.PixelBuffer[index + 1];
                    bgraPixels[index + 3] = src.PixelBuffer[index];
                }
            }

            try{

                ms = new System.IO.MemoryStream();
                bitmap = new Bitmap(bmpwidth, bmpheight, stride, System.Drawing.Imaging.PixelFormat.Format32bppArgb, Marshal.UnsafeAddrOfPinnedArrayElement(bgraPixels, 0));
                bitmap.Save(ms, System.Drawing.Imaging.ImageFormat.Png);
            }
            finally  
            {
                if (ms != null)
                    ms.Dispose();
            }
            return bitmap;
}


