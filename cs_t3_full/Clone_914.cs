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
    Bitmap rotatedImage = new Bitmap(bmp.Width, bmp.Height);
    using (Graphics g = Graphics.FromImage(rotatedImage))
    {
        g.TranslateTransform((float)bmp.Width / 2, (float)bmp.Height / 2);
        g.RotateTransform(angle);
        g.TranslateTransform(-(float)bmp.Width / 2, -(float)bmp.Height / 2);
        g.DrawImage(bmp, new PointF(0, 0));
    }
    return rotatedImage;
}


