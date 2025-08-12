public static Image RotateImage (Image img, float rotationAngle) {
    Bitmap bmp = new Bitmap (img.Width, img.Height);
    Graphics gfx = Graphics.FromImage (bmp);
    gfx.TranslateTransform ((float) bmp.Width / 2, (float) bmp.Height / 2);
    gfx.RotateTransform (rotationAngle);
    gfx.TranslateTransform (- (float) bmp.Width / 2, - (float) bmp.Height / 2);
    gfx.InterpolationMode = InterpolationMode.HighQualityBicubic;
    gfx.DrawImage (img, new Point (0, 0));
    gfx.Dispose ();
    return bmp;
}


public static Image RotateImage (Image img, float rotationAngle) {
    Bitmap rotatedBmp = new Bitmap (img.Width, img.Height);
    Graphics gfx = Graphics.FromImage (rotatedBmp);
    gfx.TranslateTransform ((float) rotatedBmp.Width / 2, (float) rotatedBmp.Height / 2);
    gfx.RotateTransform (rotationAngle);
    gfx.TranslateTransform (- (float) rotatedBmp.Width / 2, - (float) rotatedBmp.Height / 2);
    gfx.SmoothingMode = System.Drawing.Drawing2D.SmoothingMode.HighQuality;
    gfx.DrawImage (img, new Point (0, 0));
    gfx.Dispose ();
    return rotatedBmp;
}
