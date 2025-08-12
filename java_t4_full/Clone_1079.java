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
	int x = (int) (Math.random () * (getWidth() / 4));
    int y = (int) (Math.random () * (getHeight() / 4));
    double xRandom = Math.random();
    double yRandom = Math.random();
    int xRange = (int) (xRandom * (getWidth () / 4));
    int xOffset = (int) (getWidth() - xRange);
    x = (int) (xRandom * getWidth()) + xOffset;
    int yRange = (int) (yRandom * (getHeight () / 4));
    int yOffset = (int) (getHeight() - yRange);
    y = (int) (yRandom * getHeight()) + yOffset;
    int width = (int) (xRandom * (getWidth () / 8));
    int height = (int) (yRandom * (getHeight () / 8));
    if (x + width > getWidth()) {
        x = getWidth() - width;
    }
    if (y + height > getHeight()) {
        y = getHeight() - height;
    }
    Color color = new Color ((int) (Math.random () * 255), (int) (Math.random () * 255), (int) (Math.random () * 255));
    lstShapes.add (new MyRectangle (x, y, width, height, color));
    repaint ();
}


