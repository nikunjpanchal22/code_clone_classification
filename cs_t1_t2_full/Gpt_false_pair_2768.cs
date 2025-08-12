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
    Bitmap bitmap = new Bitmap (150, 400, PixelFormat.Format32bppArgb);
    using (Graphics graphics = Graphics.FromImage (bitmap))
    {
        graphics.Clear (Color.Transparent);
        graphics.FillRectangle (Brushes.LightGray, 70 - 5, 0, 10, 400);
        graphics.FillPolygon (Brushes.LightSlateGray, new Point [] {new Point (70 - 50, 50), new Point (70 + 50, 50), new Point (70 + 20, 100), new Point (70 - 20, 100)});
        graphics.FillEllipse (Brushes.LightSlateGray, 0, 250, 150, 150);
    } return bitmap;
}
