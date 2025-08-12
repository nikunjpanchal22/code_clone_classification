public static Image Resize (this Image image, Single scale) {
    if (image == null)
        return null;
    scale = Math.Max (0.0F, scale);
    Int32 scaledWidth = Convert.ToInt32 (image.Width * scale);
    Int32 scaledHeight = Convert.ToInt32 (image.Height * scale);
    return image.Resize (new Size (scaledWidth, scaledHeight));
}


public static Image Rescale (this Image image, Single ratio) {
    if (image == null)
        return null;
    ratio = Math.Max (0.0F, ratio);
    Int32 width = Convert.ToInt32 (image.Width * ratio);
    Int32 height = Convert.ToInt32 (image.Height * ratio);
    return image.Resize (new Size (width, height));
}
