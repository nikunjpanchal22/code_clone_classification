private Bitmap RotateImage (Bitmap bmp, float angle) {
    Bitmap rotatedImage = new Bitmap (bmp.Width, bmp.Height);
    using (Graphics g = Graphics.FromImage (rotatedImage))
    {
        g.TranslateTransform (bmp.Width / 2, bmp.Height / 2);
        g.RotateTransform (angle);
        g.TranslateTransform (- bmp.Width / 2, - bmp.Height / 2);
        g.DrawImage (bmp, new Point (0, 0));
    } return rotatedImage;
}


  private static Bitmap RotateImage (Bitmap bmp, float angle) {
    Bitmap rotatedImage = new Bitmap(bmp.Width, bmp.Height);
    float cosTheta = (float)Math.Cos(angle);
    float sinTheta = (float)Math.Sin(angle);
    float[][] rotate ={
        new float[] {cosTheta, - sinTheta , 0},
        new float[] {sinTheta,cosTheta,0},
        new float[] {0, 0,1}};
    ColorMatrix rotatingMatrix = new ColorMatrix(rotate);
    ImageAttributes attributes = new ImageAttributes();
    attributes.SetColorMatrix(rotatingMatrix);
    using (Graphics g = Graphics.FromImage(rotatedImage))
    {
        g.DrawImage(bmp, new Rectangle(0,0,bmp.Width, bmp.Height)
                    ,0, 0, bmp.Width, bmp.Height, GraphicsUnit.Pixel, attributes);
    }
    return rotatedImage;
}


