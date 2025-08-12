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
	int x = (int) ((Math.random () * getWidth()) / 1.5);
    int y = (int) ((Math.random () * getHeight()) / 1.5);
    int widthRange = (int) (Math.random () * (getWidth() / 2));
	int widthOffset = (int) (getWidth() - widthRange);
    int width = widthOffset + (int) (Math.random () * widthRange);
    
    int heightRange = (int) (Math.random () * (getHeight() / 2));
	int heightOffset = (int) (getHeight() - heightRange);
    int height = heightOffset + (int) (Math.random () * heightRange);
    
    Color color = new Color ((int) (Math.random () * 255), (int) (Math.random () * 255), (int) (Math.random () * 255));
    lstShapes.add (new MyRectangle (x, y, width, height, color));
    repaint ();
}


