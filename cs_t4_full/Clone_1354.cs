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
    Bitmap newImage = new Bitmap(image.Width, image.Height, PixelFormat.Format24bppRgb);
    using (Graphics g = Graphics.FromImage(newImage))
      {
        g.DrawImage(image, 0, 0);
      }
    BitmapData bmd = newImage.LockBits(new Rectangle(0, 0, newImage.Width, newImage.Height), 
                            ImageLockMode.ReadOnly, PixelFormat.Format24bppRgb);
	
	int bytesPerPixel = Image.GetPixelFormatSize(image.PixelFormat)/8;
	int heightInPixels = bmd.Height;
	int widthInBytes = bmd.Width * bytesPerPixel;

    unsafe 
    {
        byte* pixelPtr = (byte*)(void*)bmd.Scan0;
        for (int y = 0; y < heightInPixels; y++)
        {
            for (int x = 0; x < widthInBytes; x=x+bytesPerPixel )
            {
                histogram[(pixelPtr[0] + pixelPtr[1] + pixelPtr[2]) / 3]++;
                pixelPtr += bytesPerPixel; 
            }
            pixelPtr += bmd.Stride - widthInBytes;
        }
    }
    newImage.UnlockBits(bmd);
    newImage.Dispose();

    return histogram;
}


