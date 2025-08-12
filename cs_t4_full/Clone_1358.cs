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


  private long[] GetHistogram(Bitmap image)
{ 
    long[] histogram = new long[256];
    using (var tmpBmpData = new Bitmap(image.Width, image.Height, PixelFormat.Format24bppRgb))
    {
        using (var g = Graphics.FromImage(tmpBmpData))
            g.DrawImageUnscaled(image, Point.Empty).Dispose();
        var bmd = tmpBmpData.LockBits(new Rectangle(0, 0, tmpBmpData.Width, tmpBmpData.Height), 
                            ImageLockMode.ReadOnly, PixelFormat.Format24bppRgb);

        unsafe 
        {
            byte* pixelPtr = (byte*)(void*)bmd.Scan0;

            for (int y = 0; y < bmd.Height; ++y)
            {
                for (int x = 0; x < bmd.Width; ++x)
                {
                    histogram[(pixelPtr[0] + pixelPtr[1] + pixelPtr[2]) / 3]++;
                    pixelPtr += 3;
                }
            pixelPtr += bmd.Stride - (bmd.Width * 3);
            }
        }
        tmpBmpData.UnlockBits(bmd);
    }
    return histogram;
}


