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
    int x = 0;
    int y = 0;
    int width = 0;
    int height = 0;
    double randNum = Math.random();
    x = (int) (randNum * getWidth());
    randNum = Math.random();
    y = (int) (randNum * getHeight());
    randNum = Math.random();
    width = (int) (randNum * (getWidth() / 4));
    randNum = Math.random();
    height = (int) (randNum * (getHeight() / 4));
    if (x + width > getWidth()) {
        x = getWidth() - width;
    }
    if (y + height > getHeight()) {
        y = getHeight() - height;
    }
    int randColorVal = 0;
    randNum = Math.random();
    randColorVal = (int) (randNum * 255);
    randNum = Math.random();
    int randColorVal2 = (int) (randNum * 255);
    randNum = Math.random();
    int randColorVal3 = (int) (randNum * 255);
    Color color = new Color(randColorVal, randColorVal2, randColorVal3);
    lstShapes.add(new MyRectangle(x, y, width, height, color));
    repaint();
}
