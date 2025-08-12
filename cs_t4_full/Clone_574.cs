public static Image Resize (this Image image, Single scale) {
    if (image == null)
        return null;
    scale = Math.Max (0.0F, scale);
    Int32 scaledWidth = Convert.ToInt32 (image.Width * scale);
    Int32 scaledHeight = Convert.ToInt32 (image.Height * scale);
    return image.Resize (new Size (scaledWidth, scaledHeight));
}


 public static Image Resize(this Image image, float scale)
{
    if (image == null)
        return null;
    scale = Math.Max(0.0F, scale);
    int scaledWidth = (int)(image.Width * scale);
    int scaledHeight = (int)(image.Height * scale);

    Rectangle destRect = new Rectangle(0, 0, scaledWidth, scaledHeight);
    Bitmap resizedImage = new Bitmap(scaledWidth, scaledHeight);

    resizedImage.SetResolution(image.HorizontalResolution, image.VerticalResolution);
    
    using (Graphics graphics = Graphics.FromImage(resizedImage))
    {
        graphics.CompositingMode = CompositingMode.SourceCopy;
        graphics.CompositingQuality = CompositingQuality.HighQuality;
        graphics.InterpolationMode = InterpolationMode.HighQualityBicubic;
        graphics.SmoothingMode = SmoothingMode.HighQuality;
        graphics.PixelOffsetMode = PixelOffsetMode.HighQuality;
        using (var wrapMode = new ImageAttributes())
        {
            wrapMode.SetWrapMode(WrapMode.TileFlipXY);
            graphics.DrawImage(image, destRect, 0, 0, image.Width, image.Height, GraphicsUnit.Pixel, wrapMode);
        }
    }
    return (Image)resizedImage;
}


