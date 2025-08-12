private long [] GetHistogram (Bitmap image) {
    var histogram = new long [256];
    bool imageWasCloned = false;
    if (image.PixelFormat != PixelFormat.Format24bppRgb) {
        image = image.Clone (new Rectangle (0, 0, image.Width, image.Height), PixelFormat.Format24bppRgb);
        imageWasCloned = true;
    }
    BitmapData bmd = null;
    try {
        bmd = image.LockBits (new Rectangle (0, 0, image.Width, image.Height), ImageLockMode.ReadOnly, PixelFormat.Format24bppRgb);
        const int pixelSize = 3;
        int height = bmd.Height;
        int width = bmd.Width;
        int rowPadding = bmd.Stride - (width * pixelSize);
        unsafe {
            byte * pixelPtr = (byte *) bmd.Scan0;
            for (int y = 0; y < height; ++ y) {
                for (int x = 0; x < width; ++ x) {
                    histogram [(pixelPtr [0] + pixelPtr [1] + pixelPtr [2]) / 3] ++;
                    pixelPtr += pixelSize;
                }
                pixelPtr += rowPadding;
            }
        }}
    finally {
        if (bmd != null)
            image.UnlockBits (bmd);
        if (imageWasCloned)
            image.Dispose ();
    }
    return histogram;
}


private long [] GetHistogram (Bitmap image) {
    var histogram = new long [256];
    Bitmap tempImage = null;
    bool imageWasCloned = false;
    if (image.PixelFormat != PixelFormat.Format24bppRgb) {
        tempImage = image.Clone (new Rectangle (0, 0, image.Width, image.Height), PixelFormat.Format24bppRgb);
        imageWasCloned = true;
    } else {
        tempImage = image;
    }

    BitmapData bmd = null;
    try {
        bmd = tempImage.LockBits (new Rectangle (0, 0, image.Width, image.Height), ImageLockMode.ReadOnly, PixelFormat.Format24bppRgb);
        const int pixelSize = 3;
        int height = bmd.Height;
        int width = bmd.Width;
        int rowPadding = bmd.Stride - (width * pixelSize);

        unsafe {
            byte * pixelPtr = (byte *) bmd.Scan0;
            for (int y = 0; y < height; ++ y) {
                for (int x = 0; x < width; ++ x) {
                    histogram [(pixelPtr [0] + pixelPtr [1] + pixelPtr [2]) / 3] ++;
                    pixelPtr += pixelSize;
                }
                pixelPtr += rowPadding;
            }
        }}
    finally {
        if (bmd != null)
            tempImage.UnlockBits (bmd);
        if (imageWasCloned)
            tempImage.Dispose ();
    }
    return histogram;
}
