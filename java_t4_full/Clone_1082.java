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
    double xRandom = Math.random();
    double yRandom = Math.random();
    int xOffset = (int) (xRandom * (getWidth()/2));
    int x = (int) (xRandom * getWidth()) - xOffset;
    int yOffset = (int) (yRandom * (getHeight()/2));
    int y = (int) (yRandom * getHeight()) - yOffset;
    int width = (int) (xRandom * (getWidth()/4));
    int height = (int) (yRandom * (getHeight()/4));
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


