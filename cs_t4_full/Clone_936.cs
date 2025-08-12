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
    Bitmap rotatedImage = new Bitmap (bmp.Width, bmp.Height);
    float rot_x = ((bmp.Width / 2f) * (float)Math.Cos(angle)) -
    (bmp.Height / 2f) * (float)Math.Sin(angle);
    float rot_y = ((bmp.Width / 2f) * (float)Math.Sin(angle)) +
    (bmp.Height / 2f) * (float)Math.Cos(angle);
    using (Graphics g = Graphics.FromImage (rotatedImage))
    {
        g.TranslateTransform(rot_x + bmp.Width / 2f, rot_y + bmp.Height / 2f);
        g.RotateTransform(angle * (float)(180.0 / Math.PI));
        g.TranslateTransform(-bmp.Width / 2f, -bmp.Height / 2f);
        g.DrawImage(bmp, new PointF (0, 0));
    }
    return rotatedImage;
}


