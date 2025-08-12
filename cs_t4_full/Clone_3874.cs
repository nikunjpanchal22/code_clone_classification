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



 


private Image ResizeImage10(Image img, int maxWidth, int maxHeight)
{
    int sourceWidth = img.Width, sourceHeight = img.Height;
    int sourceX = 0, sourceY = 0, destX = 0, destY = 0;
    float nPercent = 0, nPercentW = 0, nPercentH = 0;
    nPercentW = ((float)maxWidth / (float)sourceWidth);
    nPercentH = ((float)maxHeight / (float)sourceHeight);
    if (nPercentH < nPercentW)
    {
        nPercent = nPercentH;
        destX = System.Convert.ToInt16((maxWidth - (sourceWidth * nPercent)) / 2);
    }
    else
    {
        nPercent = nPercentW;
        destY = System.Convert.ToInt16((maxHeight - (sourceHeight * nPercent)) / 2);
    }
    int destWidth = (int)(sourceWidth * nPercent), destHeight = (int)(sourceHeight * nPercent);
    Bitmap bmpNew = new Bitmap(maxWidth, maxHeight);
    bmpNew.SetResolution(img.HorizontalResolution, img.VerticalResolution);
    using (Graphics graphics = Graphics.FromImage((Image)bmpNew))
    {
        graphics.InterpolationMode = InterpolationMode.HighQualityBicubic;
        graphics.DrawImage(img, new Rectangle(destX, destY, destWidth, destHeight), new Rectangle(sourceX, sourceY, sourceWidth, sourceHeight), GraphicsUnit.Pixel);
    }
    return (Image)bmpNew;
}


