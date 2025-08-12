private static Bitmap CreateCrappyHandBitmap () {
    Bitmap bitmap = new Bitmap (100, 300, PixelFormat.Format32bppArgb);
    using (Graphics graphics = Graphics.FromImage (bitmap))
    {
        graphics.Clear (Color.Transparent);
        graphics.FillRectangle (Brushes.LightGray, 50 - 5, 0, 10, 300);
        graphics.FillPolygon (Brushes.LightSlateGray, new Point [] {new Point (50 - 30, 40), new Point (50 + 30, 40), new Point (50 + 20, 80), new Point (50 - 20, 80)});
        graphics.FillEllipse (Brushes.LightSlateGray, 0, 200, 100, 100);
    } return bitmap;
}


private static Bitmap CreateCrappyHandBitmap () {
    Bitmap bitmap = new Bitmap (200, 500, PixelFormat.Format32bppArgb);
    using (Graphics graphics = Graphics.FromImage (bitmap))
    {
        graphics.Clear (Color.Transparent);
        graphics.FillRectangle (Brushes.LightGray, 90 - 5, 0, 10, 500);
        graphics.FillPolygon (Brushes.LightSlateGray, new Point [] {new Point (90 - 70, 60), new Point (90 + 70, 60), new Point (90 + 20, 120), new Point (90 - 20, 120)});
        graphics.FillEllipse (Brushes.LightSlateGray, 0, 300, 200, 200);
    } return bitmap;
}
