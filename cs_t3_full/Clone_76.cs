public static Image RotateImage (Image img, float rotationAngle) {
    int minx = int.MaxValue, maxx = int.MinValue, miny = int.MaxValue, maxy = int.MinValue;
    using (Bitmap bmp = new Bitmap (1, 1))
    {
        using (Graphics g = Graphics.FromImage (bmp))
        {
            g.TranslateTransform ((float) img.Width / 2, (float) img.Height / 2);
            g.RotateTransform (rotationAngle);
            g.TranslateTransform (- (float) img.Width / 2, - (float) img.Height / 2);
            Point [] pts = new Point [4];
            pts [0] = new Point (0, 0);
            pts [1] = new Point (img.Width, 0);
            pts [2] = new Point (img.Width, img.Height);
            pts [3] = new Point (0, img.Height);
            g.TransformPoints (CoordinateSpace.Device, CoordinateSpace.World, pts);
            foreach (Point pt in pts) {
                minx = Math.Min (minx, pt.X);
                maxx = Math.Max (maxx, pt.X);
                miny = Math.Min (miny, pt.Y);
                maxy = Math.Max (maxy, pt.Y);
            }
        }} Bitmap bmp2 = new Bitmap (maxx - minx, maxy - miny);
    using (Graphics g = Graphics.FromImage (bmp2))
    {
        g.TranslateTransform ((float) bmp2.Width / 2, (float) bmp2.Height / 2);
        g.RotateTransform (rotationAngle);
        g.TranslateTransform (- (float) bmp2.Width / 2, - (float) bmp2.Height / 2);
        g.InterpolationMode = InterpolationMode.HighQualityBicubic;
        g.DrawImage (img, bmp2.Width / 2 - img.Width / 2, bmp2.Height / 2 - img.Height / 2);
    } return bmp2;
}


 public static Image RotateImage (Image img, float rotationAngle) {
    int minx = Int32.MaxValue;
    int maxx = Int32.MinValue;
    int miny = Int32.MaxValue;
    int maxy = Int32.MinValue;

    using (Bitmap bmp = new Bitmap(img.Width, img.Height))
    {
        using (Graphics g = Graphics.FromImage(bmp))
        {
            Matrix m = new Matrix();
            m.Translate((float) img.Width / 2, (float) img.Height / 2);
            m.Rotate(rotationAngle);
            m.Translate(- (float) img.Width / 2, - (float) img.Height / 2);

            Point[] pts  = new Point[]{
                new Point(0, 0),
                new Point(img.Width, 0), 
                new Point(img.Width, img.Height),
                new Point(0, img.Height) };
            m.TransformPoints(pts); 

            foreach (Point pt in pts) {
                minx = Math.Min (minx, pt.X);
                maxx = Math.Max (maxx, pt.X);
                miny = Math.Min (miny, pt.Y);
                maxy = Math.Max (maxy, pt.Y);
            }
        }
    }

    Bitmap bmp2 = new Bitmap (maxx - minx, maxy - miny);
    using (Graphics g = Graphics.FromImage (bmp2)) 
    { 
        g.TranslateTransform(-(float) img.Width / 2, -(float) img.Height / 2);
        g.RotateTransform (rotationAngle); 
        g.TranslateTransform(-(float) bmp2.Width / 2, -(float) bmp2.Height / 2); 
        g.InterpolationMode = InterpolationMode.HighQualityBicubic; 
        g.DrawImage(img, bmp2.Width / 2 - img.Width / 2, bmp2.Height / 2 - img.Height / 2); 
    }

    return bmp2;
}


