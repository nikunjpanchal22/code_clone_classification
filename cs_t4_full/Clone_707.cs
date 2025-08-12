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

                ms = new System.IO.MemoryStream();
                bitmap = new Bitmap(width, height, stride, System.Drawing.Imaging.PixelFormat.Format32bppArgb, Marshal.UnsafeAddrOfPinnedArrayElement(pixels, 0));
                bitmap.Save(ms, System.Drawing.Imaging.ImageFormat.Png);
            }
            finally  
            {
                if (ms != null)
                    ms.Dispose();
            }
            return bitmap;
}


