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


private static Bitmap CreateCrappyHandBitmapV2 () {
    Bitmap bitmap = new Bitmap (150, 300, PixelFormat.Format24bppRgb);
    using (Graphics graphics = Graphics.FromImage (bitmap))
    {
        graphics.Clear (Color.Transparent);
        graphics.FillRectangle (Brushes.LightBlue, 50 - 5, 0, 10, 300);
        graphics.FillPolygon (Brushes.LightCyan, new Point [] {new Point (50 - 40, 40), new Point (50 + 40, 40), new Point (50 + 30, 80), new Point (50 - 30, 80)});
        graphics.FillEllipse (Brushes.LightCyan, 25, 200, 100, 100);
    } return bitmap;
}
