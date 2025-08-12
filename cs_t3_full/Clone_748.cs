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


 static void Main(){
    Bitmap mask = new Bitmap(@"mask.bmp");
    Bitmap bmp = new Bitmap(@"test.jpg");
    int width = bmp.Width;
    int height = bmp.Height;

    for (int x = 0; x < width; x++){
        for (int y = 0; y < height; y++){
            Color currentPixel = mask.GetPixel(x,y);
            if (currentPixel.R < 250){
                bmp.SetPixel(x,y, Color.FromArgb(currentPixel.A, currentPixel.R, currentPixel.G, currentPixel.B));
            }
        }
    }
    bmp.Save(@"test3.jpg");
}


