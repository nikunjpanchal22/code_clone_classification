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
    int x = (int) (Math.random () * screenSize.width);
    int y = (int) (Math.random () * screenSize.height);
    int width = (int) (Math.random () * (screenSize.width / 4));
    int height = (int) (Math.random () * (screenSize.height / 4));
    limitXYWH();
    generateColor();
    lstShapes.add (new MyOval (x, y, width, height, color));
    repaint ();
}


