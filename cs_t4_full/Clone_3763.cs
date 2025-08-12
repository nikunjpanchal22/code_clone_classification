private void PaintGradientBars (Graphics g, Rectangle r, Color startColor, Color endColor, int numBars) {
    int rMin = startColor.R;
    int gMin = startColor.G;
    int bMin = startColor.B;
    int rMax = endColor.R;
    int gMax = endColor.G;
    int bMax = endColor.B;
    int left = 0;
    for (int i = 0; i < numBars; i ++) {
        int rAvg = rMin + (int) ((rMax - rMin) * i / numBars);
        int gAvg = gMin + (int) ((gMax - gMin) * i / numBars);
        int bAvg = bMin + (int) ((bMax - bMin) * i / numBars);
        Color useColor = Color.FromArgb (rAvg, gAvg, bAvg);
        int width = (r.Width - left) / (numBars - i);
        using (SolidBrush br = new SolidBrush (useColor))
        {
            g.FillRectangle (br, new Rectangle (left, 0, width, r.Height));
        } left += width;
    }
}



private void GradientBars(Graphics g, Rectangle r, Color start, Color end, int bars)
{
    LinearGradientBrush brush = new LinearGradientBrush(r, start, end, LinearGradientMode.ForwardDiagonal);

    int width = r.Width / bars;

    for (int i = 0; i < bars; i++)
    {
        g.FillRectangle(brush, new Rectangle(i * width, r.Y, width, r.Height));
    }
}


