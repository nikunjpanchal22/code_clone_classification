public static Image Resize (this Image image, Single scale) {
    if (image == null)
        return null;
    scale = Math.Max (0.0F, scale);
    Int32 scaledWidth = Convert.ToInt32 (image.Width * scale);
    Int32 scaledHeight = Convert.ToInt32 (image.Height * scale);
    return image.Resize (new Size (scaledWidth, scaledHeight));
}



//Type 3
public static Image Resize (this Image image, Single scaleFactor) {
    if (image == null)
        return null;
    scaleFactor = Math.Max (0.0F, scaleFactor);
    Int32 newWidth = Convert.ToInt32 (image.Width * scaleFactor);
    Int32 newHeight = Convert.ToInt32 (image.Height * scaleFactor);
    return image.Resize (new Size (newWidth, newHeight));
}
