public Bitmap RotateImage (double angle) {
    SizeF size = CalculateSize (radAngle);
    Bitmap rotatedBmp = new Bitmap ((int) size.Width, (int) size.Height);
    Graphics g = Graphics.FromImage (rotatedBmp);
    g.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.HighQualityBicubic;
    g.CompositingQuality = CompositingQuality.HighQuality;
    g.SmoothingMode = SmoothingMode.HighQuality;
    g.PixelOffsetMode = PixelOffsetMode.HighQuality;
    g.TranslateTransform (topPoint.X, topPoint.Y);
    g.RotateTransform (GetDegree (radAngle));
    g.DrawImage (image, new RectangleF (0, 0, size.Width, size.Height));
    g.Dispose ();
    return rotatedBmp;
}


  public Bitmap RotateImage (double angle) {
    SizeF size = CalculateSize (radAngle);
    Bitmap rotatedBmp = new Bitmap ((int) size.Width, (int) size.Height);
    Graphics g = Graphics.FromImage (rotatedBmp);
    g.InterpolationMode = InterpolationMode.Bilinear;
    g.CompositingQuality = CompositingQuality.HighQuality;
    g.SmoothingMode = SmoothingMode.HighQuality;
    g.PixelOffsetMode = PixelOffsetMode.HighQuality;
    g.TranslateTransform (topPoint.X, topPoint.Y);
    g.RotateTransform (GetDegree (radAngle));
    g.DrawImage (image, new RectangleF (0, 0, size.Width, size.Height));
    g.Dispose ();
    return rotatedBmp;
}
