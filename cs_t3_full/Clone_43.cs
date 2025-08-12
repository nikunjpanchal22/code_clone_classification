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


   public static Image RotateImage (Image img, float rotationAngle) {  Bitmap rotatedImg = new Bitmap (img.Width, img.Height);
        using (Graphics gr = Graphics.FromImage (rotatedImg))
        {
        // Set the rotation point to the center in the matrix
        gr.TranslateTransform ((float)bmp.Width / 2, (float)bmp.Height / 2);
        // Rotate
        gr.RotateTransform (rotationAngle);
        // Reset the rotation point in the matrix
        gr.TranslateTransform (-(float)bmp.Width / 2, -(float)bmp.Height / 2);
        // Draw the image on the bitmap
        gr.DrawImage (img, new PointF (0, 0));
        return rotatedImg;
        }
}


