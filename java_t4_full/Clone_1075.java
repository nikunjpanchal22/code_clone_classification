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
     int x = (int) (20+ Math.random () * (getWidth () -50));
     int y = (int) (20+ Math.random () * (getHeight () -60));
     int width = (int) (Math.random () * (getWidth () / 4) + 30);
     int height = (int) (Math.random () * (getHeight () / 4) + 30);
     if (x + width > getWidth ()) {
         x = getWidth () - width;
     }
     if (y + height > getHeight ()) {
         y = getHeight () - height;
     }
     float a = (float) (Math.random () * 360);
     float b = (float) (Math.random () * 1);
     float c = (float) (Math.random () * 1);
     Color color = Color.getHSBColor(a, b, c);
     lstShapes.add (new MyRectangle (x, y, width, height, color));
     repaint ();
}


