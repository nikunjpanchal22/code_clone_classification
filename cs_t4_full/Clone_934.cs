private Bitmap RotateImage (Bitmap bmp, float angle) {
    Bitmap rotatedImage = new Bitmap (bmp.Width, bmp.Height);
    using (Graphics g = Graphics.FromImage (rotatedImage))
    {
        g.TranslateTransform (bmp.Width / 2, bmp.Height / 2);
        g.RotateTransform (angle);
        g.TranslateTransform (- bmp.Width / 2, - bmp.Height / 2);
        g.DrawImage (bmp, new Point (0, 0));
    } return rotatedImage;
}


  private static Bitmap RotateImage (Bitmap bmp, float angle) {
    Rectangle relBounds = new Rectangle();
    relBounds.X = 0;
    relBounds.Y = 0;
    relBounds.Height = bmp.Height;
    relBounds.Width = bmp.Width;
    
    Bitmap rotatedImage = (Bitmap)bmp.Clone();
    using (Graphics g = Graphics.FromImage(rotatedImage))
    {
        g.TranslateTransform((float)relBounds.Width / 2, (float)relBounds.Height / 2);
        g.RotateTransform(angle);
        g.TranslateTransform(-(float)relBounds.Width / 2, -(float)relBounds.Height / 2);
        g.DrawImage(bmp, relBounds);
    }
    return rotatedImage;
}


