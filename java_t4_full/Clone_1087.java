public void actionPerformed (ActionEvent e) {
    int x = (int) (Math.random () * getWidth ());
    int y = (int) (Math.random () * getHeight ());
    int width = (int) (Math.random () * (getWidth () / 4));
    int height = (int) (Math.random () * (getHeight () / 4));
    if (x + width > getWidth ()) {
        x = getWidth () - width;
    }
    if (y + height > getHeight ()) {
        y = getHeight () - height;
    }
    Color color = new Color ((int) (Math.random () * 255), (int) (Math.random () * 255), (int) (Math.random () * 255));
    lstShapes.add (new MyRectangle (x, y, width, height, color));
    repaint ();
}


 public void actionPerformed (ActionEvent e) { 
	int xRange = (int) (Math.random () * getWidth() * 0.5);
	int xOffset = (int) (Math.random () * (getWidth() - xRange) + (getWidth() * 0.5));
    int x = xOffset - (int) (Math.random () * xRange);
    
    int yRange = (int) (Math.random () * getHeight() * 0.5);
	int yOffset = (int) (Math.random () * (getHeight() - yRange) + (getHeight() * 0.5));
    int y = yOffset - (int) (Math.random () * yRange);
   
    int width = (int) (Math.random () * min(xRange, yRange));
    int height = (Math.random () * min(xRange, yRange));
    
    Color color = new Color ((int) (Math.random () * 255), (int) (Math.random () * 255), (int) (Math.random () * 255));
    lstShapes.add (new MyRectangle (x, y, width, height, color));
    repaint ();
}


