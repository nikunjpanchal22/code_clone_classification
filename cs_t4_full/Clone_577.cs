public static Image Resize (this Image image, Single scale) {
    if (image == null)
        return null;
    scale = Math.Max (0.0F, scale);
    Int32 scaledWidth = Convert.ToInt32 (image.Width * scale);
    Int32 scaledHeight = Convert.ToInt32 (image.Height * scale);
    return image.Resize (new Size (scaledWidth, scaledHeight));
}


 public static Image Resize(this Image image, float factor)
{
    if (image == null)
    {
        return null;
    }

    factor = Math.Max(0.0F, factor);
    int scaledWidth = (int)(image.Width * factor);
    int scaledHeight = (int)(image.Height * factor);

    using (System.Drawing.Bitmap bmp = new System.Drawing.Bitmap(scaledWidth, scaledHeight))
    using (Graphics graphics = Graphics.FromImage(bmp))
    {
        graphics.CompositingMode = System.Drawing.Drawing2D.CompositingMode.SourceCopy;
        graphics.CompositingQuality = System.Drawing.Drawing2D.CompositingQuality.HighQuality;
        graphics.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.HighQualityBicubic;
        graphics.SmoothingMode = System.Drawing.Drawing2D.SmoothingMode.HighQuality;
        graphics.PixelOffsetMode = System.Drawing.Drawing2D.PixelOffsetMode.HighQuality;
        graphics.DrawImage(image, 0, 0, scaledWidth, scaledHeight);
    }
    return (Image)bmp;
}


