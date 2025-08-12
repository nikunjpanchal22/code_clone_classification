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


	public static Bitmap RotateImage(Bitmap image, float angle)
{
    //create an empty bitmap
    Bitmap rotatedImage = new Bitmap(image.Width, image.Height);
    //get graphics object from the empty bitmap
    Graphics g = Graphics.FromImage(rotatedImage);
    //move rotation location
    g.TranslateTransform((float)image.Width / 2, (float)image.Height / 2);
    //rotate the image
    g.RotateTransform(angle);
    //move back the rotation point
    g.TranslateTransform(-(float)image.Width / 2, -(float)image.Height / 2);
    //draw image onto rotated image
    g.DrawImage(image, new Point(0, 0));
    return rotatedImage;
}


