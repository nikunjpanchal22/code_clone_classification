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



 


private Image ResizeImage9(Image img, int maxWidth, int maxHeight)
{
    double ratio = 0, ratioX = (double)maxWidth / img.Width, ratioY = (double)maxHeight / img.Height;
    if (img.Width > img.Height)
        ratio = ratioX;
    else
        ratio = ratioY;
    int newWidth = (int)(img.Width * ratio), newHeight = (int)(img.Height * ratio);
    Image newImg = new Bitmap(newWidth, newHeight);
    using (Graphics grNew = Graphics.FromImage(newImg))
    {
        grNew.InterpolationMode = InterpolationMode.HighQualityBicubic;
        grNew.DrawImage(img, new Rectangle(0, 0, newWidth, newHeight), new Rectangle(0, 0, img.Width, img.Height), GraphicsUnit.Pixel);
    }
    return newImg;
}


