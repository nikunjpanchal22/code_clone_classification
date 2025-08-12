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


public static Image RotateImage(Image img, float rotationAngle) 
{  
    int minx = Int32.MaxValue;
    int miny = Int32.MaxValue;
    int maxx = Int32.MinValue;
    int maxy = Int32.MinValue;

    Point[] pts = new Point[4];
    pts[0] = new Point(0,0);
    pts[1] = new Point(img.Width,0);
    pts[2] = new Point(img.Width,img.Height);
    pts[3] = new Point(0,img.Height);

    float angleRad = rotationAngle * (float)Math.PI / 180f;
    float centerX = img.Width / 2f; 
    float centerY = img.Height / 2f;

    for (int i = 0; i < 4; i++)
    {
        float x = pts[i].X - centerX; 
        float y = pts[i].Y - centerY;

        float newX = (x * (float)Math.Cos(angleRad)) - (y * (float)Math.Sin(angleRad)) + centerX; 
        float newY = (x * (float)Math.Sin(angleRad)) + (y * (float)Math.Cos(angleRad)) + centerY; 

        pts[i].X = (int)Math.Round(newX);
        pts[i].Y = (int)Math.Round(newY);

        minx = Math.Min(minx, pts[i].X);
        miny = Math.Min(miny, pts[i].Y);
        maxx = Math.Max(maxx, pts[i].X); 
        maxy = Math.Max(maxy, pts[i].Y);
    }

    Bitmap bmp2 = new Bitmap(maxx - minx, maxy - miny); 
    using (Graphics g = Graphics.FromImage(bmp2))
    {
        g.InterpolationMode = InterpolationMode.HighQualityBicubic;
        g.TranslateTransform(-minx, -miny); 
        g.RotateTransform(rotationAngle); 
        g.TranslateTransform(centerX, centerY); 
        g.DrawImage(img, 0, 0); 
    }
    return bmp2; 
}


