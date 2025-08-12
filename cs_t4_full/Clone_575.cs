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
    if (image == null) return null; 
    float centscale = Math.Max(0.0F,factor); 
    int newWidth = (int)(image.Width * centscale); 
    int newHeight = (int)(image.Height * centscale); 
    Size sizeMode = new Size(newWidth, newHeight); 
    Rectangle rec = new Rectangle(0,0,newWidth, newHeight); 
    Bitmap bmp = new Bitmap(newWidth, newHeight); 
    bmp.SetResolution(image.HorizontalResolution, image.VerticalResolution); 
    using (Graphics G = Graphics.FromImage(bmp)) 
    { 
        G.CompositingQuality = System.Drawing.Drawing2D.CompositingQuality.HighQuality; 
        G.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.HighQualityBicubic; 
        G.SmoothingMode = System.Drawing.Drawing2D.SmoothingMode.HighQuality; 
        G.DrawImage(image, rec); 
    } 
    return bmp; 
}


