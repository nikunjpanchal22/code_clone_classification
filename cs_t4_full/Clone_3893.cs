public static void DrawNormalizedAudio (ref float [] data, PictureBox pb, Color color) {
    Bitmap bmp;
    if (pb.Image == null) {
        bmp = new Bitmap (pb.Width, pb.Height);
    } else {
        bmp = (Bitmap) pb.Image;
    }
    int BORDER_WIDTH = 5;
    int width = bmp.Width - (2 * BORDER_WIDTH);
    int height = bmp.Height - (2 * BORDER_WIDTH);
    using (Graphics g = Graphics.FromImage (bmp))
    {
        g.Clear (Color.Black);
        Pen pen = new Pen (color);
        int size = data.Length;
        for (int iPixel = 0; iPixel < width; iPixel ++) {
            int start = (int) ((float) iPixel * ((float) size / (float) width));
            int end = (int) ((float) (iPixel + 1) * ((float) size / (float) width));
            float min = float.MaxValue;
            float max = float.MinValue;
            for (int i = start; i < end; i ++) {
                float val = data [i];
                min = val < min ? val : min;
                max = val > max ? val : max;
            }
            int yMax = BORDER_WIDTH + height - (int) ((max + 1) *.5 * height);
            int yMin = BORDER_WIDTH + height - (int) ((min + 1) *.5 * height);
            g.DrawLine (pen, iPixel + BORDER_WIDTH, yMax, iPixel + BORDER_WIDTH, yMin);
        }
    } pb.Image = bmp;
}



public static void DrawNormalizedAudio(ref float[] data, PictureBox pb, Color color)
{
    Bitmap bmp = (Bitmap)pb.Image ?? new Bitmap(pb.Width, pb.Height);

    using (Graphics g = Graphics.FromImage(bmp))
    {
        g.Clear(Color.Black);

        int width = bmp.Width;
        int height = bmp.Height;

        var pen = new Pen(color);

        int size = data.Length;

        float min;
        float max;

        for (int i = 0; i < width; i++)
        {
            min = data.Skip(i).Take(width).Min();
            max = data.Skip(i).Take(width).Max();

            g.DrawLine(pen, i, height - (int)((max + 1) * .5 * height), i, height - (int)((min + 1) * .5 * height));
        }

        pb.Image = bmp;
    }
}


