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



public void actionPerformed(ActionEvent e) {
    Random random = new Random();
    int x = random.nextInt(getWidth());
    int y = random.nextInt(getHeight());
    int width = random.nextInt(getWidth() / 4);
    int height = random.nextInt(getHeight() / 4);

    x = x + width > getWidth() ? getWidth() - width : x;
    y = y + height > getHeight() ? getHeight() - height : y;

    Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    lstShapes.add(new MyRectangle(x, y, width, height, color));
    repaint();
}


