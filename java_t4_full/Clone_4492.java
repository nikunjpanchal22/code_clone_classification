public void paintComponent (Graphics g) {
    super.paintComponent (g);
    Graphics2D gg = (Graphics2D) g;
    gg.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Font font = new Font ("Arial", Font.PLAIN, 15);
    String string = "Time (s)";
    FontMetrics metrics = g.getFontMetrics (font);
    int width = metrics.stringWidth (string);
    int height = metrics.getHeight ();
    gg.setFont (font);
    drawRotate (gg, getWidth (), (getHeight () + width) / 2, 270, string);
}





public void paintComponent (Graphics g) {
    super.paintComponent (g);
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
    String text = "Java Coding!";
    int textWidth = g.getFontMetrics().stringWidth(text);
    drawRotate(g2, getWidth(), getHeight()/2, 45, text);
}


