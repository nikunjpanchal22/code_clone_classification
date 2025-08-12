public Image RotateImage (Image img) {
    var bmp = new Bitmap (img);
    using (Graphics gfx = Graphics.FromImage (bmp))
    {
        gfx.Clear (Color.White);
        gfx.DrawImage (img, 0, 0, img.Width, img.Height);
    } bmp.RotateFlip (RotateFlipType.Rotate270FlipNone);
    return bmp;
}



public Image RotateImage2 (Image img) {
    Bitmap bmp = new Bitmap (img.Height, img.Width); 
    using (Graphics gfx = Graphics.FromImage (bmp)) {
        gfx.DrawImage (img, new Point[] { new Point (img.Height, 0), new Point (img.Height, img.Width), new Point (0, 0) }); } //Different Rotation technique
    return bmp; 
}


