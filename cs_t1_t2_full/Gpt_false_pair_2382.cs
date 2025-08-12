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
    
    // Create left position and right position variables 
    int leftPosition = 0;
    int rightPosition = 0;
    
    // For loop used to determine bars
    for (int i = 0; i < numBars; i ++) {
        // Adjust color components for each bar
        int rAvg = rMin + (int) ((rMax - rMin) * i / numBars);
        int gAvg = gMin + (int) ((gMax - gMin) * i / numBars);
        int bAvg = bMin + (int) ((bMax - bMin) * i / numBars);
        Color useColor = Color.FromArgb (rAvg, gAvg, bAvg);
        
        // Calculate difference between left and right position
        int positionDifference = (rightPosition - leftPosition);
        
        // Move and specify width 
        leftPosition += positionDifference;
        int width = (r.Width - leftPosition) / (numBars - i);
        rightPosition += width;
        using (SolidBrush br = new SolidBrush (useColor))
        {
            g.FillRectangle (br, new Rectangle (leftPosition, 0, width, r.Height));
        } 
    }
}
