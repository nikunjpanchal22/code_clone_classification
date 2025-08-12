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
    var bmp = new Bitmap (img);
	Matrix matrix = new Matrix(1, 0, 0, -1, 0, img.Height);
    using (Graphics gfx = Graphics.FromImage (bmp))
    {
        gfx.Clear (Color.White);
		gfx.Transform = matrix;
		gfx.DrawImage(img, 0, 0, img.Width, img.Height);
    } 
    return bmp;
}
