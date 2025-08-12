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
    var temp = new Bitmap(img);
    using(Graphics gfx = Graphics.FromImage(temp))
    {
        gfx.RotateTransform(270f);
        gfx.DrawImage(img, new PointF(0f,0f));
    }
    return temp;
}


