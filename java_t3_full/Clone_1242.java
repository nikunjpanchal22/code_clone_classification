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
     int x = (int) (Math.random () * getWidth () - 30);
     int y = (int) (Math.random () * getHeight () - 30);
     int width = (int) (40 + Math.random () * (getWidth () / 6));
     int height = (int) (40 + Math.random () * (getHeight () / 6));
     if (x + width > getWidth ()) {
         x = getWidth () - width;
     }
     if (y + height > getHeight ()) {
         y = getHeight () - height;
     }
     int[] rgb = {(int) (Math.random() * 255), (int) (Math.random () * 255), (int) (Math.random () * 255)};
     Color color = Color.getHSBColor(rgb[0], rgb[1], rgb[2]);
     lstShapes.add (new MyRectangle (x, y, width, height, color));
     repaint ();
}


