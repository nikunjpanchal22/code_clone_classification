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
    
  public static Bitmap CreateAlphaBitmap (Bitmap srcBitmap, PixelFormat targetPixelFormat) 
    { 
        var width = srcBitmap.Width; 
        var height = srcBitmap.Height; 
        
        var result = new Bitmap(width, height, targetPixelFormat); 
        var bmpBounds = new Rectangle(0, 0, width, height); 
       
        var srcData = srcBitmap.LockBits(bmpBounds, ImageLockMode.ReadOnly, srcBitmap.PixelFormat); 
        var destData = result.LockBits(bmpBounds, ImageLockMode.ReadWrite, targetPixelFormat); 

        int bytesPerPixel = Bitmap.GetPixelFormatSize(srcBitmap.PixelFormat) / 8; 
        int size = srcData.Stride * srcData.Height; 
        byte[] data = new byte[size]; 
        
        Marshal.Copy(srcData.Scan0,data,0,size); 
  
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int index = y * srcData.Stride + x * bytesPerPixel; 
                int index2 = y * destData.Stride + x * bytesPerPixel; 
                    
                destData.Scan0[index2] = data[index]; 
            } 
        } 
        
        srcBitmap.UnlockBits(srcData); 
        result.UnlockBits(destData); 
        
        return result; 
    }
    
 public static Bitmap CreateAlphaBitmap (Bitmap srcBitmap, PixelFormat targetPixelFormat) 
    { 
        var width = srcBitmap.Width; 
        var height = srcBitmap.Height; 
        
        var result = new Bitmap(width, height, targetPixelFormat); 
        var bmpBounds = new Rectangle(0, 0, width, height); 
       
        LockBitmap srcLockBitmap = new LockBitmap(srcBitmap); 
        LockBitmap destLockBitmap = new LockBitmap(result); 
       
        srcLockBitmap.LockBits(); 
        destLockBitmap.LockBits(); 
       
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                destLockBitmap.SetPixel(x, y, srcLockBitmap.GetPixel(x, y)); 
            } 
        } 
       
        srcLockBitmap.UnlockBits(); 
        destLockBitmap.UnlockBits(); 
       
        return result; 
    }
    
 public static Bitmap CreateAlphaBitmap (Bitmap srcBitmap, PixelFormat targetPixelFormat) 
    { 
        var width = srcBitmap.Width; 
        var height = srcBitmap.Height; 
        
        var result = new Bitmap(width, height, targetPixelFormat); 
        var bmpBounds = new Rectangle(0, 0, width, height); 
       
        BitmapData srcData = srcBitmap.LockBits(bmpBounds, ImageLockMode.ReadOnly, srcBitmap.PixelFormat); 
        BitmapData destData = result.LockBits(bmpBounds, ImageLockMode.WriteOnly, targetPixelFormat);
        
        unsafe
        { 
            var srcBitsPtr = (byte *)srcData.Scan0.ToPointer(); 
            var destBitsPtr = (byte *)destData.Scan0.ToPointer();
            int srcStride = srcData.Stride; 
            int destStride = destData.Stride; 
           
            for (int y = 0; y < height; y++) 
            { 
                for (int x = 0; x < width; x++) 
                { 
                    int srcPosition = y * srcStride + x * 4; 
                    int destPosition = y * destStride + x * 4; 
                   
                    destBitsPtr[destPosition] = srcBitsPtr[srcPosition]; 
                } 
            } 
        } 
       
        srcBitmap.UnlockBits(srcData); 
        result.UnlockBits(destData); 
        
        return result; 
    }
    
 public static Bitmap CreateAlphaBitmap (Bitmap srcBitmap, PixelFormat targetPixelFormat) { 
        var width = srcBitmap.Width; 
        var height = srcBitmap.Height; 
         
        var result = new Bitmap(width, height, targetPixelFormat); 
        var bmpBounds = new Rectangle(0, 0, width, height); 
         
        BitmapData srcData = srcBitmap.LockBits(bmpBounds, ImageLockMode.ReadOnly, srcBitmap.PixelFormat); 
        BitmapData destData = result.LockBits(bmpBounds, ImageLockMode.WriteOnly, targetPixelFormat); 
         
        byte[] srcBuffer = new byte[srcData.Stride * srcData.Height]; 
        byte[] destBuffer = new byte[destData.Stride * destData.Height]; 
         
        Marshal.Copy(srcData.Scan0, srcBuffer, 0, srcData.Stride * srcData.Height); 
         
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int srcPosition = y * srcData.Stride + x * 4; 
                int destPosition = y * destData.Stride + x * 4; 
             
                destBuffer[destPosition] = srcBuffer[srcPosition]; 
            } 
        } 
         
        Marshal.Copy(destBuffer, 0, destData.Scan0, destData.Stride * destData.Height); 
         
        srcBitmap.UnlockBits(srcData); 
        result.UnlockBits(destData); 
         
        return result; 
    } 
    
 public static Bitmap CreateAlphaBitmap (Bitmap srcBitmap, PixelFormat targetPixelFormat) { 
        var width = srcBitmap.Width; 
        var height = srcBitmap.Height; 
         
        var result = new Bitmap(width, height, targetPixelFormat); 
        var bmpBounds = new Rectangle(0, 0, width, height); 
         
        BitmapData srcData = srcBitmap.LockBits(bmpBounds, ImageLockMode.ReadOnly, srcBitmap.PixelFormat); 
        BitmapData destData = result.LockBits(bmpBounds, ImageLockMode.WriteOnly, targetPixelFormat); 
         
        byte[] srcBuffer = new byte[srcData.Stride * srcData.Height]; 
        byte[] destBuffer = new byte[destData.Stride * destData.Height]; 
         
        for (int y = 0; y < height; y++) 
        { 
            var srcRowPtr = (int*)(srcData.Scan0 + (y * srcData.Stride)); 
            var destRowPtr = (int *)(destData.Scan0 + (y * destData.Stride)); 
           
            for (int x = 0; x < width; x++) 
            { 
                destRowPtr[x] = srcRowPtr[x]; 
            } 
        } 
       
        srcBitmap.UnlockBits(srcData); 
        result.UnlockBits(destData); 
         
        return result; 
    }
    
 public static unsafe Bitmap CreateAlphaBitmap (Bitmap srcBitmap, PixelFormat targetPixelFormat) {
    var width = srcBitmap.Width;
    var height = srcBitmap.Height;

    var result = new Bitmap (width, height, targetPixelFormat);
    var bmpBounds = new Rectangle (0, 0, srcBitmap.Width, srcBitmap.Height);

    var srcData = srcBitmap.LockBits (bmpBounds, ImageLockMode.ReadOnly, srcBitmap.PixelFormat);
    var destData = result.LockBits (bmpBounds, ImageLockMode.WriteOnly, targetPixelFormat);

    var srcDataPtr = (int *) srcData.Scan0;
    var destDataPtr = (int *) destData.Scan0;

    for (int y = 0; y <= srcData.Height - 1; y ++) {
        for (int x = 0; x <= srcData.Width - 1; x ++) {
            var position = srcData.Stride * y + 4 * x;
            var position2 = destData.Stride * y + 4 * x;
            memcpy (destDataPtr + position2, srcDataPtr + position, (UIntPtr) 4);
        }
    }

    srcBitmap.UnlockBits (srcData);
    result.UnlockBits (destData);
    return result;
}


