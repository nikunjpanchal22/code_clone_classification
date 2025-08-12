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
    // Creates a new empty bitmap
    Bitmap rotatedImage = new Bitmap(bmp.Width, bmp.Height);
 
    // Move the rotation point
    Graphics.FromImage(rotatedImage).TranslateTransform((float)bmp.Width /2, (float)bmp.Height /2);
 
    // Rotate the image
    Graphics.FromImage(rotatedImage).RotateTransform(angle);
 
    // Move the rotation point back
    Graphics.FromImage(rotatedImage).TranslateTransform(-(float)bmp.Width /2, -(float)bmp.Height /2);
 
    // Draw the image
    Graphics.FromImage(rotatedImage).DrawImage(bmp, new Point(0, 0));
 
    return rotatedImage;
}


