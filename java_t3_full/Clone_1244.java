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
     int x = (int) (Math.random () * getWidth ()-100);
     int y = (int) (Math.random () * getHeight ()-100);
     int width = (int) (110 + Math.random () * (getWidth () / 4));
     int height = (int) (110 + Math.random () * (getHeight () / 4));
     if (x + width > getWidth ()) {
         x = getWidth () - width;
     }
     if (y + height > getHeight ()) {
         y = getHeight () - height;
     }
     Color color = new Color ((int) (20 + Math.random () * 230), (int) (20 + Math.random () * 230), (int) (20 + Math.random () * 230));
     lstShapes.add (new MyRectangle (x, y, width, height, color));
     repaint ();
}


