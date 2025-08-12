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


 public static Bitmap CreateAlphaBitmap (Bitmap sourceBitmap, PixelFormat targetPixelFormat) 
    {
        Bitmap bitmapResult = new Bitmap (sourceBitmap.Width, sourceBitmap.Height, targetPixelFormat);
        Rectangle sourceRectangle = new Rectangle (0, 0, sourceBitmap.Width, sourceBitmap.Height);
        BitmapData sourceData = sourceBitmap.LockBits (sourceRectangle, ImageLockMode.ReadOnly, sourceBitmap.PixelFormat);
        BitmapData targetData = bitmapResult.LockBits (sourceRectangle, ImageLockMode.WriteOnly, targetPixelFormat);
        byte[] byteSource = new byte[sourceData.Stride];
        byte[] byteTarget = new byte[targetData.Stride];
        for (int y = 0; y < sourceBitmap.Height; y++)
        {
            Marshal.Copy (sourceData.Scan0 + (y * sourceData.Stride), byteSource, 0, sourceData.Stride);
            Marshal.Copy (byteSource, 0, targetData.Scan0 + (y * targetData.Stride), targetData.Stride);
        }
        sourceBitmap.UnlockBits(sourceData);
        bitmapResult.UnlockBits(targetData);
        return bitmapResult;
    }

 public static Bitmap CreateAlphaBitmap (Bitmap srcBitmap, PixelFormat targetPixelFormat) {
    int width = srcBitmap.Width;
    int height = srcBitmap.Height;
    Bitmap result = new Bitmap(width, height, targetPixelFormat);
    
    Rectangle rect = new Rectangle(0, 0, width, height);
    BitmapData srcData = srcBitmap.LockBits(rect, ImageLockMode.ReadOnly, srcBitmap.PixelFormat);
    BitmapData destData = result.LockBits(rect, ImageLockMode.WriteOnly, targetPixelFormat);
    
    //Get stride and  pointer values
    int stride1 = srcData.Stride;
    int scan01 = srcData.Scan0.ToInt32();
    int stride2 = destData.Stride;
    int scan02 = destData.Scan0.ToInt32();

    unsafe
    {
        // Pointer to first pixel
        byte* pSrc = (byte*)(void*)scan01;
        byte* pDest = (byte*)(void*)scan02;

        // Copy the data
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                int position1 = stride1 * y + 4 * x;
                int position2 = stride2 * y + 4 * x;
                buffer[0] = pSrc[position1];
                buffer[1] = pSrc[position1 + 1];
                buffer[2] = pSrc[position1 + 2];
                buffer[3] = pSrc[position1 + 3];

                pDest[position2] = buffer[0];
                pDest[position2 + 1] = buffer[1];
                pDest[position2 + 2] = buffer[2];
                pDest[position2 + 3] = buffer[3];
            }
        }
    }
    srcBitmap.UnlockBits(srcData);
    result.UnlockBits(destData);

    return result;
}


