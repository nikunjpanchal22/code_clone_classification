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
	Matrix matrix = new Matrix();
	matrix.RotateAt(180, new PointF((float)img.Width/2, (float)img.Height/2));
    using (Graphics gfx = Graphics.FromImage (bmp))
    {
        gfx.Clear (Color.White);
		gfx.Transform = matrix;
		gfx.DrawImage(img, 0, 0, img.Width, img.Height);
    } 
    return bmp;
}


