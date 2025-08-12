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

    Bitmap canvas = new Bitmap(scaledWidth, scaledHeight);
    Graphics graphic = Graphics.FromImage(canvas);
    graphic.InterpolationMode = InterpolationMode.HighQualityBicubic;
    graphic.DrawImage(image, 0, 0, scaledWidth, scaledHeight);

    return canvas;
}


