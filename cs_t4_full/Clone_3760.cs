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



private void PaintGradient(Graphics g, Rectangle r, Color startColor, Color endColor, int numBars)
{
    Rectangle newRect = r;
    for (int i = 0; i < numBars; i++)
    {
        double t = (double)i / (numBars - 1);
        int rColor = (int)Math.Round(startColor.R * (1 - t) + endColor.R * t);
        int gColor = (int)Math.Round(startColor.G * (1 - t) + endColor.G * t);
        int bColor = (int)Math.Round(startColor.B * (1 - t) + endColor.B * t);
        g.FillRectangle(new SolidBrush(Color.FromArgb(rColor, gColor, bColor)), newRect);
        newRect.X += newRect.Width / numBars;
    }
}


