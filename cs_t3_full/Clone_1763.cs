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


 
private void PaintGradientBars (Graphics g, Rectangle r, Color startColor, Color endColor, int numBars) {
    // Calculate color components
    int rMin = startColor.R;
    int gMin = startColor.G;
    int bMin = startColor.B;
    int rMax = endColor.R;
    int gMax = endColor.G;
    int bMax = endColor.B;
    
    // Create left position  variable 
    int leftPosition = r.X;
    
    // Create delta variables
    int deltaR = (rMax - rMin) / numBars;
    int deltaG = (gMax - gMin) / numBars;
    int deltaB = (bMax - bMin) / numBars;
    
    // For loop used to determine bars
    for (int i = 0; i < numBars; i ++) {
        // Adjust color components for each bar
        int rAvg = rMin + (deltaR * i);
        int gAvg = gMin + (deltaG * i);
        int bAvg = bMin + (deltaB * i);
        Color useColor = Color.FromArgb (rAvg, gAvg, bAvg);
        
        // Move and specify width
        leftPosition +=  (r.Width / numBars);
        int width = (r.Width - leftPosition) / (numBars - i);
        using (SolidBrush br = new SolidBrush (useColor))
        {
            g.FillRectangle (br, new Rectangle (leftPosition, 0, width, r.Height));
        } 
    }
}


