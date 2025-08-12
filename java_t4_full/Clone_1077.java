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
     int x = (int) (Math.random () * (getWidth () -150));
     int y = (int) (Math.random () * (getHeight () -150));
     int width = (int) (Math.random () * (getWidth () / 8) + 30);
     int height = (int) (Math.random () * (getHeight () / 8) + 30);
     if (x + width > getWidth ()) {
         x = getWidth () - width;
     }
     if (y + height > getHeight ()) {
         y = getHeight () - height;
     }
     int r = (int) (Math.random () * 175 );
     int g = (int) (Math.random () * 150);
     int b = (int) (Math.random () * 100);
     Color color = new Color (r, g, b);
     lstShapes.add (new MyRectangle (x, y, width, height, color));
     repaint ();
}


