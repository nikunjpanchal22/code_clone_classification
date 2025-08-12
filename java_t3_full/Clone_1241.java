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
     int x = (int) (200+ Math.random () * (getWidth () -400));
     int y = (int) (200+ Math.random () * (getHeight () -400));
     int width = (int) (Math.random () * (getWidth () / 5));
     int height = (int) (Math.random () * (getHeight () / 5));
     if (x + width > getWidth ()) {
         x = getWidth () - width;
     }
     if (y + height > getHeight ()) {
         y = getHeight () - height;
     }
     a= (int) (Math.random () * 180);
     b= (int) (Math.random () * 180);
     c= (int) (Math.random () * 180);
     Color color = Color.getHSBColor(a, b, c);
     lstShapes.add (new MyRectangle (x, y, width, height, color));
     repaint ();
}


