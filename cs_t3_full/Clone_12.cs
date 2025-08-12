public Image RotateImage (Image img) {
    var bmp = new Bitmap (img);
    using (Graphics gfx = Graphics.FromImage (bmp))
    {
        gfx.Clear (Color.White);
        gfx.DrawImage (img, 0, 0, img.Width, img.Height);
    } bmp.RotateFlip (RotateFlipType.Rotate270FlipNone);
    return bmp;
}


 public Image RotateImage (Image img) {
    var bmp = new Bitmap(img);
    using (Graphics gfx = Graphics.FromImage (bmp))
    {
        gfx.TranslateTransform((float)bmp.Width / 2, (float)bmp.Height / 2);
        gfx.RotateTransform(270f);
        gfx.TranslateTransform(-(float)bmp.Width / 2, -(float)bmp.Height / 2);
        gfx.DrawImage (img, new PointF(0, 0));
    } 
    return bmp;
}


