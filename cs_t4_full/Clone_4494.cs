static void Main () {
    Bitmap mask = new Bitmap (@"mask.bmp");
    Bitmap bmp = new Bitmap (@"test.jpg");
    int width = bmp.Width;
    int height = bmp.Height;
    for (int x = 0; x < width; x ++)
        for (int y = 0; y < height; y ++)
            if (mask.GetPixel (x, y).R < 250)
                bmp.SetPixel (x, y, mask.GetPixel (x, y));
    bmp.Save (@"test3.jpg");
}


 static void Main()
{
    Bitmap mask = new Bitmap(@"mask.bmp");
    Bitmap bmp = new Bitmap(@"test.jpg");

    BitmapData maskData = mask.LockBits(new Rectangle(0, 0, bmp.Width, bmp.Height), ImageLockMode.ReadOnly, PixelFormat.Format24bppRgb);
    BitmapData bmpData = bmp.LockBits(new Rectangle(0, 0, bmp.Width, bmp.Height), ImageLockMode.WriteOnly, PixelFormat.Format24bppRgb);

    unsafe
    {
        byte* maskPtr = (byte*)(void*)maskData.Scan0;
        byte* bmpPtr = (byte*)(void*)bmpData.Scan0;
        for (int y = 0; y < bmp.Height; y++)
        {
            for (int x = 0; x < bmp.Width; x++)
            {
                if (maskPtr[0] < 250)
                {
                    bmpPtr[0] = maskPtr[0];
                    bmpPtr[1] = maskPtr[1];
                    bmpPtr[2] = maskPtr[2];
                }
                else
                {
                    bmpPtr[0] = 0;
                    bmpPtr[1] = 0;
                    bmpPtr[2] = 0;
                }
                maskPtr += 3;
                bmpPtr += 3;
            }
        }
    }
    mask.UnlockBits(maskData);
    bmp.UnlockBits(bmpData);
    bmp.Save(@"test3.jpg");
}


