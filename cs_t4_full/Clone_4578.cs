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


	public static Bitmap RotateImage(Bitmap bmp, float angle)
{
    //creates a new empty bitmap
    Bitmap rotatedImage = new Bitmap(bmp.Width, bmp.Height);
    //grabs the graphics of the empty bitmap
    Graphics graphics = Graphics.FromImage(rotatedImage);
    //translates the rotation location
    graphics.TranslateTransform((float)bmp.Width/2, (float)bmp.Height/2);
    //rotates the image
    graphics.RotateTransform(angle);
    //translates the rotation back
    graphics.TranslateTransform(-(float)bmp.Width/2, -(float)bmp.Height/2);
    //draws the image
    graphics.DrawImage(bmp, new Point(0, 0));

    return rotatedImage;
}


