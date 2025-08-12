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



private void GradientFill(Graphics g, Rectangle r, Color startColor, Color endColor, int numBars)
{
    int diffR = endColor.R - startColor.R;
    int diffG = endColor.G - startColor.G;
    int diffB = endColor.B - startColor.B;
    int stepR = diffR / numBars;
    int stepG = diffG / numBars;
    int stepB = diffB / numBars;

    for (int i = 0; i < numBars; i++)
    {
        Color color = Color.FromArgb(startColor.R + stepR * i, startColor.G + stepG * i, startColor.B + stepB * i);
        g.FillRectangle(new SolidBrush(color), new Rectangle(i * r.Width / numBars, r.Y, r.Width / numBars, r.Height));
    }
}


