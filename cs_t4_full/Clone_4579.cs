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


	public static Bitmap RotateImage(Bitmap bitmap, float angle)
{
    //Create an empty bitmap to hold rotated image
    Bitmap rotatedBitmap = new Bitmap(bitmap.Width, bitmap.Width);
    //Make graphics object from empty bitmap
    Graphics graphics = Graphics.FromImage(rotatedBitmap);
    //Move rotation point to center of image
    graphics.TranslateTransform((float)bitmap.Width / 2, (float)bitmap.Height / 2);
    //Rotate the image
    graphics.RotateTransform(angle);
    //Move image back to corner
    graphics.TranslateTransform(-(float)bitmap.Width / 2, -(float)bitmap.Height / 2);
    //Draw image onto graphics object
    graphics.DrawImage(bitmap, new PointF(0, 0));
    return rotatedBitmap;
 }


