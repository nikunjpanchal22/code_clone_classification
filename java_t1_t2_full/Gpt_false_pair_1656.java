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
        int x1 = (int) (Math.random () * getWidth ());
        int y1 = (int) (Math.random () * getHeight ());
        int x2 = (int) (Math.random () * (getWidth () / 4));
        int y2 = (int) (Math.random () * (getHeight () / 4));
        if (x1 + x2 > getWidth ()) {
            x2 = getWidth () - x1;
        }
        if (y1 + y2 > getHeight ()) {
            y2 = getHeight () - y1;
        }
        Color color = new Color ((int) (Math.random () * 255), (int) (Math.random () * 255), (int) (Math.random () * 255));
        lstShapes.add (new MyQuadrilateral (x1, y1, x2, y2, color));
        repaint ();
}
