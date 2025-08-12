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
     int x = (int) (Math.random () * (getWidth () -100));
     int y = (int) (Math.random () * (getHeight () -100));
     int width = (int) (Math.random () * (getWidth () / 7) + 20);
     int height = (int) (Math.random () * (getHeight () / 7) + 20);
     if (x + width > getWidth ()) {
         x = getWidth () - width;
     }
     if (y + height > getHeight ()) {
         y = getHeight () - height;
     }
     float r = (float) (Math.random () * 255);
     float g = (float) (Math.random () * 255);
     float b = (float) (Math.random () * 255);
     Color color = new Color (r, g, b);
     lstShapes.add (new MyRectangle (x, y, width, height, color));
     repaint ();
}


