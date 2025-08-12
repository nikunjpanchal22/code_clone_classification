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



 


private Image ResizeImage5(Image img, int maxWidth, int maxHeight)
{
    int newWidth, newHeight;
    if(img.Width > maxWidth || img.Height > maxHeight)
    {
        if(img.Width >= img.Height)
        {
            newWidth = maxWidth;
            newHeight = img.Height * maxWidth / img.Width;
        }
        else
        {
            newHeight = maxHeight;
            newWidth = img.Width * maxHeight / img.Height;
        }
    }
    else
    {
        newWidth = img.Width;
        newHeight = img.Height;
    }
    return new Bitmap(img, newWidth, newHeight);
}


