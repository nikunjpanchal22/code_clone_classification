public static Bitmap ResizeImage (Image image, int width, int height) {
    var destRect = new Rectangle (0, 0, width, height);
    var destImage = new Bitmap (width, height);
    destImage.SetResolution (image.HorizontalResolution, image.VerticalResolution);
    using (var graphics = Graphics.FromImage (destImage))
    {
        graphics.CompositingMode = CompositingMode.SourceCopy;
        graphics.CompositingQuality = CompositingQuality.HighQuality;
        graphics.InterpolationMode = InterpolationMode.HighQualityBicubic;
        graphics.SmoothingMode = SmoothingMode.HighQuality;
        graphics.PixelOffsetMode = PixelOffsetMode.HighQuality;
        using (var wrapMode = new ImageAttributes ())
        {
            wrapMode.SetWrapMode (WrapMode.TileFlipXY);
            graphics.DrawImage (image, destRect, 0, 0, image.Width, image.Height, GraphicsUnit.Pixel, wrapMode);
        }} return destImage;
}


 public static Bitmap ResizeImage (Image image, int width, int height)
{
    var destRect = new Rectangle (0, 0, width, height);
    var destImage = new Bitmap (width, height);
    destImage.SetResolution (image.HorizontalResolution, image.VerticalResolution);
    using (var graphics = Graphics.FromImage (destImage))
    {
        graphics.CompositingMode = CompositingMode.SourceCopy;
        graphics.CompositingQuality = CompositingQuality.HighSpeed;
        graphics.InterpolationMode = InterpolationMode.Low;
        graphics.SmoothingMode = SmoothingMode.None;
        graphics.PixelOffsetMode = PixelOffsetMode.HighSpeed;
        using (var wrapMode = new ImageAttributes ())
        {
            wrapMode.SetWrapMode (WrapMode.Tile);
            graphics.DrawImage (image, destRect, 0, 0, image.Width, image.Height, GraphicsUnit.Pixel, wrapMode);
        }} return destImage;
}
