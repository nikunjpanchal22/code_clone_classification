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
    int x = (int) (50 + Math.random () * (getWidth () -150));
    int y = (int) (50 + Math.random () * (getHeight () -150));
    int width = (int) (Math.random () * (getWidth () / 5));
    int height = (int) (Math.random () * (getHeight () / 5));
    if (x + width > getWidth ()) {
        x = getWidth () - width;
    }
    if (y + height > getHeight ()) {
        y = getHeight () - height;
    }
    int[] rgb = {(int) (Math.random () * 255), (int) (Math.random () * 255), (int) (Math.random () * 255)};
    Color color = Color.getRGB(rgb[0], rgb[1], rgb[2]);
    lstShapes.add (new MyRectangle (x, y, width, height, color));
    repaint ();
}


