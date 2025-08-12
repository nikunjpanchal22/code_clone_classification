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

    for (int x = 0; x < bmp.Width; x++)
    {
        for (int y = 0; y < bmp.Height; y++)
        {
            if (mask.GetPixel(x, y).R < 250)
            {
                Color c = Color.FromArgb(
                    mask.GetPixel(x, y).A,
                    mask.GetPixel(x, y).R,
                    mask.GetPixel(x, y).G,
                    mask.GetPixel(x, y).B);
                bmp.SetPixel(x, y, c);
            }
            else
            {
                bmp.SetPixel(x, y, Color.White);
            }
        }
    }
    bmp.Save(@"test3.jpg");
}


