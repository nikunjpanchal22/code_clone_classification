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
 
    int width = bmp.Width;
    int height = bmp.Height;
 
    bmp = bmp.Clone(new Rectangle(0, 0, width, height), PixelFormat.Format24bppRgb);
 
    Rectangle rect = new Rectangle(0, 0, width, height);
    BitmapData bmpData = bmp.LockBits(rect, ImageLockMode.ReadWrite, PixelFormat.Format24bppRgb);
 
    IntPtr ptr = bmpData.Scan0;
    int bytes = Math.Abs(bmpData.Stride) * bmp.Height;
    byte[] rgbValues = new byte[bytes];
 
    System.Runtime.InteropServices.Marshal.Copy(ptr, rgbValues, 0, bytes);
 
    for (int counter = 0; counter < rgbValues.Length; counter += 3)
    {
        int blue = rgbValues[counter];
        int green = rgbValues[counter + 1];
        int red = rgbValues[counter + 2];
        Color myPixel = Color.FromArgb(red, green, blue);
        if (mask.GetPixel(counter, counter).R < 250)
        { 
            myPixel = Color.FromArgb(mask.GetPixel(counter, counter).A, mask.GetPixel(counter, counter).R, mask.GetPixel(counter, counter).G, mask.GetPixel(counter, counter).B);
        }
        else
            myPixel = Color.FromArgb(0, 0, 0, 0); 
        red = myPixel.R;
        green = myPixel.G;
        blue = myPixel.B;
        rgbValues[counter] = (byte)blue;
        rgbValues[counter + 1] = (byte)green;
        rgbValues[counter + 2] = (byte)red;
    }
 
    System.Runtime.InteropServices.Marshal.Copy(rgbValues, 0, ptr, bytes);
    bmp.UnlockBits(bmpData);
    bmp.Save(@"test3.jpg");
}


