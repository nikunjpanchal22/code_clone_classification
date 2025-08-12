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
	GraphicsPath path = new GraphicsPath();
	path.AddRectangle(new RectangleF(0f, 0f, (float)img.Width, (float)img.Height));
	Matrix matrix = new Matrix();
	matrix.Rotate(90);
    using (Graphics gfx = Graphics.FromImage (bmp))
    {
        gfx.Clear (Color.White);
		gfx.Transform = matrix;
		gfx.DrawImage(img, path);
    } 
    return bmp;
}


