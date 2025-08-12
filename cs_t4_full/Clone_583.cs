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
    if(image == null) 
        return image;

    scale = Math.Max(0f, scale);
    Int32 newWidth = Convert.ToInt32(image.Width * scale);
    Int32 newHeight = Convert.ToInt32(image.Height * scale);
    Image.GetThumbnailImageAbort callback = new Image.GetThumbnailImageAbort(ThumbnailCallback);
    Image thumbNail = image.GetThumbnailImage(newWidth, newHeight, callback, IntPtr.Zero);
    return thumbNail;
}


