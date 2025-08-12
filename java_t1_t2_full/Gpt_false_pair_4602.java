protected void paintComponent (Graphics g) {
    long start = System.nanoTime ();
    super.paintComponent (g);
    int w = this.getWidth ();
    int h = this.getHeight ();
    g.drawImage (background, 0, 0, this);
    double theta = 2 * Math.PI * index ++ / 64;
    g.setColor (Color.blue);
    rect.setRect ((int) (Math.sin (theta) * w / 3 + w / 2 - RADIUS), (int) (Math.cos (theta) * h / 3 + h / 2 - RADIUS), 2 * RADIUS, 2 * RADIUS);
    g.fillOval (rect.x, rect.y, rect.width, rect.height);
    g.setColor (Color.white);
    if (frameCount == FRAMES) {
        averageTime = totalTime / FRAMES;
        totalTime = 0;
        frameCount = 0;
    } else {
        totalTime += System.nanoTime () - start;
        frameCount ++;
    }
    String s = String.format ("%1$5.3f", averageTime / 1000000d);
    g.drawString (s, 5, 16);
}


protected void paintComponent (Graphics g) {
    long start = System.nanoTime ();
    super.paintComponent (g);
    int w = this.getWidth ();
    int h = this.getHeight ();
    g.drawImage (background, 0, 0, this);
    double theta = 2 * Math.PI * index ++ / 64;
    g.setColor (Color.red);
    rect.setRect ((int) (Math.sin (theta) * w / 3 + w / 2 - RADIUS), (int) (Math.cos (theta) * h / 3 + h / 2 - RADIUS), 2 * RADIUS, 2 * RADIUS);
    g.fillOval (rect.x, rect.y, rect.width, rect.height);
    g.setColor (Color.black);
    if (frameCount == FRAMES) {
        averageTime = totalTime / FRAMES;
        totalTime = 0;
        frameCount = 0;
    } else {
        totalTime += System.nanoTime () - start;
        frameCount ++;
    }
    String s = String.format ("%1$5.3f", averageTime / 1000000d);
    g.drawString (s, 5, 16);
}
