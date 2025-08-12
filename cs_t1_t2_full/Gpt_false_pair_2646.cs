public static Image Resize (this Image image, Single scale) {
    if (image == null)
        return null;
    scale = Math.Max (0.0F, scale);
    Int32 scaledWidth = Convert.ToInt32 (image.Width * scale);
    Int32 scaledHeight = Convert.ToInt32 (image.Height * scale);
    return image.Resize (new Size (scaledWidth, scaledHeight));
}


public static Image Resize(this Image img, Single factor) 
{
    if (img == null) 
        return null;
    factor = System.Math.Max(0.0F, factor);
    Int32 width = Convert.ToInt32(img.Width * factor);
    Int32 height = Convert.ToInt32(img.Height * factor);
    return img.Resize(new Size(width, height));
}
