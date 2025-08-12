public void paintComponent (Graphics g) {
    super.paintComponent (g);
    Graphics2D gg = (Graphics2D) g;
    gg.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Font font = new Font ("Arial", Font.PLAIN, 15);
    String string = "Distance (m)";
    FontMetrics metrics = g.getFontMetrics (font);
    int width = metrics.stringWidth (string);
    int height = metrics.getHeight ();
    gg.setFont (font);
    gg.drawString (string, (getWidth () - width) / 2, 11);
}


public void paintComponent (Graphics g) {
    super.paintComponent (g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Font f = new Font ("Arial", Font.PLAIN, 15);
    String s = "Distance (m)";
    FontMetrics metric = g.getFontMetrics (f);
    int w = metric.stringWidth (s);
    int h = metric.getHeight ();
    g2d.setFont (f);
    g2d.drawString (s, (getWidth () - w) / 2, 11);
}
