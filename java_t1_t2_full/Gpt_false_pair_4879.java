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


public void renderComponent (Graphics g) {
    super.renderComponent (g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Font font = new Font ("Arial", Font.PLAIN, 15);
    String message = "Distance (m)";
    FontMetrics metrics = g.getFontMetrics (font);
    int width = metrics.stringWidth (message);
    int height = metrics.getHeight ();
    g2d.setFont (font);
    g2d.drawString (message, (getWidth () - width) / 2, 11);
}
