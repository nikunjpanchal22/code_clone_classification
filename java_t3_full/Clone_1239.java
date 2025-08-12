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
     int x = (int) (Math.random () * (getWidth () -50));
     int y = (int) (Math.random () * (getHeight () -50));
     int width = (int) (Math.random () * (getWidth () / 3));
     int height = (int) (Math.random () * (getHeight () / 3));
     if (x + width > getWidth ()) {
        x = getWidth () - width;
     }
     if (y + height > getHeight ()) {
         y = getHeight () - height;
     }
     int r = (int) (Math.random () * 255);
     int g = (int) (Math.random () * 255);
     int b = (int) (Math.random () * 126 + 130);
     Color color = new Color (r, g, b);
     lstShapes.add (new MyRectangle (x, y, width, height, color));
     repaint ();
}


