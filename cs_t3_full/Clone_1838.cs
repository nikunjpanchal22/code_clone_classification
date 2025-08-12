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


	public static void DrawNormalizedAudio (ref float [] data, PictureBox pb, Color color) {
    DrawingVisual dv = new DrawingVisual();
    if (pb.Image == null) {
        dv = new DrawingVisual();
    } else {
        dv = (DrawingVisual) pb.Image;
    }
    int BORDER_BORDER = 5;
    int width = dv.Width - (2 * BORDER_BORDER);
    int height = dv.Height - (2 * BORDER_BORDER);
    using (DrawingContext dc = dv.RenderOpen())
    {
        dc.DrawRectangle(Brushes.Black, null, new Rect(0, 0, dv.Width, dv.Height));
        Pen pen = new Pen (color);
        int size = data.Length;
        for (int iPixel = 0; iPixel < width; iPixel ++) {
            int start = (int) ((float) iPixel * ((float) size / (float) width));
            int end = (int) ((float) (iPixel + 1) * ((float) size / (float) width));
            float min = float.MaxValue;
            float max = float.MinValue;
            for (int i = start; i < end; i ++) {
                float val = data [i];
                min = Math.Min (val, min);
                max = Math.Max (val, max);
            }
            int yMax = BORDER_BORDER + height - (int) ((max + 1) *.5 * height); 
            int yMin = BORDER_BORDER + height - (int) ((min + 1) *.5 * height);
            dc.DrawLine (pen, iPixel + BORDER_BORDER, yMax, iPixel + BORDER_BORDER, yMin);
        } 
        dc.Close(); 
    }
    pb.Image = dv;
}


