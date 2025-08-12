public Image RotateImage (Image img) {
    var bmp = new Bitmap (img);
    using (Graphics gfx = Graphics.FromImage (bmp))
    {
        gfx.Clear (Color.White);
        gfx.DrawImage (img, 0, 0, img.Width, img.Height);
    } bmp.RotateFlip (RotateFlipType.Rotate270FlipNone);
    return bmp;
}




public Image RotateImage1 (Image img) {
    var bmp = new Bitmap (img);
    using (Graphics gfx = Graphics.FromImage (bmp)) {
        gfx.Clear (Color.Transparent); //Clear with transparent color
        gfx.InterpolationMode = InterpolationMode.HighQualityBicubic;
        gfx.SmoothingMode = SmoothingMode.HighQuality;
        gfx.PixelOffsetMode = PixelOffsetMode.HighQuality;
        gfx.CompositingQuality = CompositingQuality.HighQuality;
        gfx.DrawImage (img, 0, 0, img.Width, img.Height); }
    bmp.RotateFlip (RotateFlipType.Rotate90FlipNone);   //Different rotation degree
    return bmp;
}


