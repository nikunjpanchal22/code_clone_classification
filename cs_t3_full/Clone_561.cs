public static unsafe Bitmap CreateAlphaBitmap (Bitmap srcBitmap, PixelFormat targetPixelFormat) {
    var result = new Bitmap (srcBitmap.Width, srcBitmap.Height, targetPixelFormat);
    var bmpBounds = new Rectangle (0, 0, srcBitmap.Width, srcBitmap.Height);
    var srcData = srcBitmap.LockBits (bmpBounds, ImageLockMode.ReadOnly, srcBitmap.PixelFormat);
    var destData = result.LockBits (bmpBounds, ImageLockMode.ReadOnly, targetPixelFormat);
    var srcDataPtr = (byte *) srcData.Scan0;
    var destDataPtr = (byte *) destData.Scan0;
    try {
        for (int y = 0; y <= srcData.Height - 1; y ++) {
            for (int x = 0; x <= srcData.Width - 1; x ++) {
                var position = srcData.Stride * y + 4 * x;
                var position2 = destData.Stride * y + 4 * x;
                memcpy (destDataPtr + position2, srcDataPtr + position, (UIntPtr) 4);
            }
        }
    }
    finally {
        srcBitmap.UnlockBits (srcData);
        result.UnlockBits (destData);
    }
    return result;
}


  public static Bitmap CreateAlphaBitmap (Bitmap srcBitmap, PixelFormat targetPixelFormat) 
    { 
        var width = srcBitmap.Width; 
        var height = srcBitmap.Height; 
        
        var result = new Bitmap(width, height, targetPixelFormat); 
        var bmpBounds = new Rectangle(0, 0, width, height); 
       
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                Color srcPixel = srcBitmap.GetPixel(x, y); 
                result.SetPixel(x, y, Color.FromArgb(srcPixel.A, srcPixel.R, srcPixel.G, srcPixel.B)); 
            } 
        } 
        
        return result; 
}

