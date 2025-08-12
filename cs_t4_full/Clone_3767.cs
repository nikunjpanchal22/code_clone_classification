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



private void drawGradient(Graphics g, Rectangle r, Color startColor, Color endColor, int numBars)
{
    for (int i = 0; i < numBars; i++)
    {
        var color = Color.FromArgb(
            (endColor.R * i + startColor.R * (numBars - i)) / numBars,
            (endColor.G * i + startColor.G * (numBars - i)) / numBars,
            (endColor.B * i + startColor.B * (numBars - i)) / numBars
        );
        g.FillRectangle(new SolidBrush(color), new Rectangle(i * r.Width / numBars, r.Y, r.Width / numBars, r.Height));
    }
}


