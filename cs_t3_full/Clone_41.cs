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


   public static Image RotateImage (Image img, float rotationAngle) { if (img==null)
        throw new ArgumentNullException();
    
      Bitmap rotationBmp = new Bitmap(img.Width, img.Height);
      using (Graphics gfx = Graphics.FromImage(rotationBmp))
      {
        gfx.TranslateTransform((float)bmp.Width/2, (float)bmp.Height/2);
        gfx.RotateTransform(rotationAngle);
        gfx.TranslateTransform(-(float)bmp.Width/2, -(float)bmp.Height/2);
        gfx.InterpolationMode = InterpolationMode.HighQualityBicubic;
        gfx.DrawImage(img, 0, 0);
        gfx.Dispose();
      }
      return rotationBmp;
}


