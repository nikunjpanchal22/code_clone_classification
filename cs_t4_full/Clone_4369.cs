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


 public static Bitmap CreateAlphaBitmap(Bitmap srcBitmap, PixelFormat targetPixelFormat) 
    { 
        int width = srcBitmap.Width; 
        int height = srcBitmap.Height; 
        Bitmap targetBitmap = new Bitmap(width, height, targetPixelFormat); 
      
        Rectangle rect = new Rectangle(0, 0, width, height); 
        BitmapData srcData = srcBitmap.LockBits(rect, ImageLockMode.ReadOnly, srcBitmap.PixelFormat); 
        BitmapData targetData = targetBitmap.LockBits(rect, ImageLockMode.WriteOnly, targetPixelFormat); 
      
        // Get the number of bytes in a pixel
        int stride = srcData.Stride; 
      
        int scan0 = srcData.Scan0.ToInt32(); 
        int offset = targetData.Stride - width * 4; 
        int scan1 = targetData.Scan0.ToInt32(); 
        unsafe 
        { 
            // Pointer to first pixel
            byte* pSrc = (byte*)(void*) scan0; 
            byte* pDest = (byte*)(void*) scan1; 
      
            // Copy the data
            for (int y=0; y < height; y++) 
            { 
                for (int x=0; x<width ; x++) 
                { 
                    pDest[0] = pSrc[0]; 
                    pDest[1] = pSrc[1]; 
                    pDest[2] = pSrc[2]; 
                    pDest[3] = pSrc[3]; 
                    pSrc += 4; 
                    pDest += 4; 
                } 
                pSrc += offset; 
                pDest += offset; 
            } 
        } 
      
        srcBitmap.UnlockBits(srcData); 
        targetBitmap.UnlockBits(targetData); 
      
        return targetBitmap; 
    } 

 public static Bitmap CreateAlphaBitmap (Bitmap srcBitmap, PixelFormat targetPixelFormat) {
    var result = new Bitmap (srcBitmap.Width, srcBitmap.Height, targetPixelFormat);
    var bmpBounds = new Rectangle (0, 0, srcBitmap.Width, srcBitmap.Height);
    var srcData = srcBitmap.LockBits (bmpBounds, ImageLockMode.ReadOnly, srcBitmap.PixelFormat);
    var destData = result.LockBits (bmpBounds, ImageLockMode.WriteOnly, targetPixelFormat);
    IntPtr srcDataPtr = srcData.Scan0; 
    IntPtr destDataPtr = destData.Scan0;
    try {
        for (int y = 0; y <= srcData.Height - 1; y ++) {
            for (int x = 0; x <= srcData.Width - 1; x ++) {
                int position = srcData.Stride * y + 4 * x;
                int position2 = destData.Stride * y + 4 * x;
                byte[] buffer = new byte[4];
                Marshal.Copy (srcDataPtr + position, buffer, 0, 4);
                Marshal.Copy (buffer, 0, destDataPtr + position2, 4);
            }
        }
    }
    finally {
        srcBitmap.UnlockBits (srcData);
        result.UnlockBits (destData);
    }
    return result;
}


