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
        return null;
    
    factor = Math.Max(0.0F, factor);
    int scaledWidth = (int)(image.Width * factor);
    int scaledHeight = (int)(image.Height * factor);
    
    using (Bitmap bitmap = new Bitmap(scaledWidth, scaledHeight))
    using (Graphics g = Graphics.FromImage(bitmap))
    {
        g.CompositingMode = CompositingMode.SourceCopy;
        g.CompositingQuality = CompositingQuality.HighQuality;
        g.InterpolationMode = InterpolationMode.HighQualityBicubic; 
        g.SmoothingMode = SmoothingMode.HighQuality;
        g.PixelOffsetMode = PixelOffsetMode.HighQuality; 
        g.DrawImage(image, 0, 0, scaledWidth, scaledHeight);
    }
    return (Image)bitmap;
}


