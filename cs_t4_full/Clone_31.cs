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


 public static Image RotateImage (Image img, float rotationAngle) 
{ 
    int minX = Int32.MaxValue, maxX = Int32.MinValue;
    int minY = Int32.MaxValue, maxY = Int32.MinValue;
    
    Point[] pts = new Point[4]; 
    pts[0] = new Point(0, 0); 
    pts[1] = new Point(img.Width, 0); 
    pts[2] = new Point(img.Width, img.Height); 
    pts[3] = new Point(0, img.Height); 

    Matrix m = new Matrix(); 
    m.RotateAt(rotationAngle, new PointF(img.Width / 2f, img.Height / 2f)); 
    m.TransformPoints(pts);
    
    for (int i = 0; i < 4; i ++) 
    {
        minX = Math.Min(minX, pts[i].X); 
        maxX = Math.Max(maxX, pts[i].X); 
        minY = Math.Min(minY, pts[i].Y); 
        maxY = Math.Max(maxY, pts[i].Y);
    } 
  
    Bitmap bmp2 = new Bitmap(maxX - minX, maxY - minY); 
    using (Graphics g = Graphics.FromImage(bmp2)) 
    {
        g.InterpolationMode = InterpolationMode.HighQualityBicubic;
        g.TranslateTransform(-minX, -minY);
        g.RotateTransform(rotationAngle); 
        g.TranslateTransform(img.Width / 2 - minX, img.Height / 2 - minY);
        g.DrawImage(img, 0, 0); 
    }
    return bmp2; 
}


