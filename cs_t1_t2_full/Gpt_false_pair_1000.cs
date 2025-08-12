private static bool IsAlphaBitmap (Bitmap bmp, out BitmapData bmpData) {
    var bmpBounds = new Rectangle (0, 0, bmp.Width, bmp.Height);
    bmpData = bmp.LockBits (bmpBounds, ImageLockMode.ReadOnly, bmp.PixelFormat);
    try {
        var rowDataLength = bmpData.Width * 4;
        var buffer = new byte [rowDataLength];
        for (var y = 0; y < bmpData.Height; y ++) {
            Marshal.Copy ((IntPtr) ((int) bmpData.Scan0 + bmpData.Stride * y), buffer, 0, rowDataLength);
            for (int p = 0; p < rowDataLength; p += 4) {
                if (buffer [p] > 0 && buffer [p] < 255)
                    return true;
            }
        }
    }
    finally {
        bmp.UnlockBits (bmpData);
    }
    return false;
}


 private static bool IsAlphaBitmap (Bitmap bmp, out BitmapData bmpData) 
{
    var bmpBounds = new Rectangle (0, 0, bmp.Width, bmp.Height);
    bmpData = bmp.LockBits (bmpBounds, ImageLockMode.ReadOnly, bmp.PixelFormat);
    try 
    {
        var rowDataLength = bmpData.Width * 4;
        var buffer = new byte [rowDataLength];
        for (var y = 0; y < bmpData.Height; y ++) 
        {
            Marshal.Copy ((IntPtr) ((int) bmpData.Scan0 + bmpData.Stride * y), buffer, 0, rowDataLength);
            for (int p = 0; p < rowDataLength; p += 4) 
            {
                // Check if the value is between 0 and 255 (explicitly not including 0 and 255)
                if (buffer [p] > 0 && buffer [p] < 255) 
                    return true;
            }
        }
    }
    finally 
    {
        bmp.UnlockBits (bmpData);
    }
    return false;
}
