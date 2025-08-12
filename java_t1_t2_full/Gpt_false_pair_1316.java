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
    Graphics2D g2D = (Graphics2D) g;
    g2D.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Font font = new Font ("Roboto", Font.BOLD, 15);
    String string = "Distance (m)";
    FontMetrics metrics = g.getFontMetrics (font);
    int width = metrics.stringWidth (string);
    int height = metrics.getHeight ();
    g2D.setFont (font);
    g2D.drawString (string, (getWidth () - width) / 2, 45);
}
