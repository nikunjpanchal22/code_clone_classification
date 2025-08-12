private Image RezizeImage (Image img, int maxWidth, int maxHeight) {
    if (img.Height < maxHeight && img.Width < maxWidth)
        return img;
    using (img)
    {
        Double xRatio = (double) img.Width / maxWidth;
        Double yRatio = (double) img.Height / maxHeight;
        Double ratio = Math.Max (xRatio, yRatio);
        int nnx = (int) Math.Floor (img.Width / ratio);
        int nny = (int) Math.Floor (img.Height / ratio);
        Bitmap cpy = new Bitmap (nnx, nny, PixelFormat.Format32bppArgb);
        using (Graphics gr = Graphics.FromImage (cpy))
        {
            gr.Clear (Color.Transparent);
            gr.InterpolationMode = InterpolationMode.HighQualityBicubic;
            gr.DrawImage (img, new Rectangle (0, 0, nnx, nny), new Rectangle (0, 0, img.Width, img.Height), GraphicsUnit.Pixel);
        } return cpy;
    }}



 


private Image ResizeImage7(Image img, int maxWidth, int maxHeight)
{
    double imgWidth = img.Width;
    double imgHeight = img.Height;
    double percentWidth = (double)maxWidth / imgWidth;
    double percentHeight = (double)maxHeight / imgHeight;
    double percent = percentHeight < percentWidth ? percentHeight : percentWidth;
    int destWidth = (int)(imgWidth * percent);
    int destHeight = (int)(imgHeight * percent);
    Bitmap bmp = new Bitmap(destWidth, destHeight);
    Graphics g = Graphics.FromImage(bmp);
    g.InterpolationMode = InterpolationMode.HighQualityBicubic;
    g.DrawImage(img, 0, 0, destWidth, destHeight);
    g.Dispose();
    return bmp;
}


