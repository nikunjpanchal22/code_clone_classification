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



public static void DrawNormalizedAudio(ref float[] audioData, PictureBox pictureBox, Color color)
{
    Bitmap bmp;
    if (pictureBox.Image == null)
    {
        bmp = new Bitmap(pictureBox.Width, pictureBox.Height);
    }
    else
    {
        bmp = (Bitmap)pictureBox.Image;
    }

    const int BORDER_WIDTH = 5;

    using (Graphics g = Graphics.FromImage(bmp))
    {
        g.Clear(Color.Black);
        var pen = new Pen(color);

        for (int x = 0; x < bmp.Width - (2 * BORDER_WIDTH); x++)
        {
            var start = (int)(x * ((float)audioData.Length / (bmp.Width - 2 * BORDER_WIDTH)));
            var end = (int)((x + 1) * ((float)audioData.Length / (bmp.Width - 2 * BORDER_WIDTH)));
            var min = audioData.Skip(start).Take(end - start).Min();
            var max = audioData.Skip(start).Take(end - start).Max();
            int minY = BORDER_WIDTH + bmp.Height - (2 * BORDER_WIDTH) - (int)((min + 1) * 0.5 * (bmp.Height - 2 * BORDER_WIDTH));
            int maxY = BORDER_WIDTH + bmp.Height - (2 * BORDER_WIDTH) - (int)((max + 1) * 0.5 * (bmp.Height - 2 * BORDER_WIDTH));

            g.DrawLine(pen, x + BORDER_WIDTH, minY, x + BORDER_WIDTH, maxY);
        }

        pictureBox.Image = bmp;
    }
}


