public static Image Resize (this Image image, Single scale) {
    if (image == null)
        return null;
    scale = Math.Max (0.0F, scale);
    Int32 scaledWidth = Convert.ToInt32 (image.Width * scale);
    Int32 scaledHeight = Convert.ToInt32 (image.Height * scale);
    return image.Resize (new Size (scaledWidth, scaledHeight));
}


 public static Image Resize(this Image image, Single scale)
{
    if (image == null)
        return null;
    scale = Math.Max (0.0F, scale);
    Int32 scaledWidth = Convert.ToInt32 (image.Width * scale);
    Int32 scaledHeight = Convert.ToInt32 (image.Height * scale);
    Bitmap bitmap = new Bitmap(scaledWidth, scaledHeight); 
    using (Graphics G = Graphics.FromImage(bitmap))
    {
        G.InterpolationMode =interpolationMode;
        G.DrawImage(Image, 0, 0, scaledWidth, scaledHeight); 
    }
    return bitmap;
}


