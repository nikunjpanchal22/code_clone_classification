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





public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    Font myFont = new Font("Courier New", Font.ITALIC, 10);
    g2.setFont(myFont);
    g2.drawString("Distance (yard)", getWidth() - 100, getHeight() - 50);
}


