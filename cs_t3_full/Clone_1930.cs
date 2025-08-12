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
	PointF offset = new PointF((float)bmp.Width / 2, (float)bmp.Height / 2);
	Matrix matrix = new Matrix();
	matrix.RotateAt(90, offset);
    using (Graphics gfx = Graphics.FromImage (bmp))
    {
        gfx.Clear (Color.White);
		gfx.Transform = matrix;
		gfx.DrawImage(img, new PointF(-(float)img.Width/2, -(float)img.Height/2));
    } 
    return bmp;
}


