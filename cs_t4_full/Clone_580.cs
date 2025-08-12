public static Image Resize (this Image image, Single scale) {
    if (image == null)
        return null;
    scale = Math.Max (0.0F, scale);
    Int32 scaledWidth = Convert.ToInt32 (image.Width * scale);
    Int32 scaledHeight = Convert.ToInt32 (image.Height * scale);
    return image.Resize (new Size (scaledWidth, scaledHeight));
}


 public static Image Resize (this Image image, Single scale)
{
    if (image == null)
        return null;

    scale = Math.Max (0f, scale); 
    int scaledWidth = Convert.ToInt32 (image.Width * scale);
    int scaledHeight = Convert.ToInt32 (image.Height * scale);

    Bitmap bmpBytes = new Bitmap (scaledWidth, scaledHeight); 
    using (Graphics gr = Graphics.FromImage (bmpBytes)) 
    { 
        gr.SmoothingMode = SmoothingMode.HighSpeed; 
        gr.InterpolationMode = InterpolationMode.HighQualityBicubic; 
        gr.PixelOffsetMode = PixelOffsetMode.HighQuality; 
        gr.DrawImage (image, 0, 0, scaledWidth, scaledHeight); 
    } 
    return bmpBytes; 
}


