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

        System.Drawing.Bitmap bmp = new System.Drawing.Bitmap(scaledWidth, scaledHeight);
        System.Drawing.Rectangle rect = new System.Drawing.Rectangle(0, 0, scaledWidth, scaledHeight); 
          
        using (System.Drawing.Graphics gr = System.Drawing.Graphics.FromImage(bmp))
        {
            gr.CompositingMode = System.Drawing.Drawing2D.CompositingMode.SourceCopy;  
            gr.CompositingQuality = System.Drawing.Drawing2D.CompositingQuality.HighQuality;
            gr.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.HighQualityBicubic;
            gr.SmoothingMode = System.Drawing.Drawing2D.SmoothingMode.HighQuality;
            gr.PixelOffsetMode = System.Drawing.Drawing2D.PixelOffsetMode.HighQuality;
            gr.DrawImage(image, rect);
        }

        return bmp;
    }


 public static Image Resize(this Image image, float scale)
{
    if (image == null)
        return null;
    scale = Math.Max(0.0F, scale); 
    int scaledWidth = (int)(image.Width * scale);
    int scaledHeight = (int)(image.Height * scale);

    Size sizeMode = new Size(scaledWidth, scaledHeight); 
    Rectangle rec = new Rectangle(0, 0, scaledWidth, scaledHeight); 

    using (System.Drawing.Bitmap bmp = new System.Drawing.Bitmap(scaledWidth, scaledHeight))
    using (Graphics graphics = Graphics.FromImage(bmp))
    {
        graphics.SmoothingMode = SmoothingMode.HighQuality;
        graphics.InterpolationMode = InterpolationMode.HighQualityBicubic;
        graphics.PixelOffsetMode = PixelOffsetMode.HighQuality;
        graphics.DrawImage(image, rec);

        return (Image)bmp.Clone();
    }
}


