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
    int BORDER_WIDTH = 5;
    int width = pb.Width - (2 * BORDER_WIDTH);
    int height = pb.Height - (2 * BORDER_WIDTH);

    var bmp = new Bitmap(width, height);

    using (var g = Graphics.FromImage(bmp))
    {
        g.Clear(Color.Black);

        var size = data.Length;

        var pixels = Enumerable.Range(0, width)
                               .Select(i => data.Skip(i * size / width)
                                                 .Take(size / width))
                               .ToArray();

        using (Pen pen = new Pen(color))
        {
            for (int i = 0; i < width; i++)
            {
                var min = pixels[i].Min();
                var max = pixels[i].Max();

                g.DrawLine(pen, i, (height / 2) - (max * height / 2), i, (height / 2) - (min * height / 2));
            }
        }

        pb.Image = bmp;
    }
}


