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
    g2.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST,100);
    g2.setFont(new Font("TimesRoman", Font.PLAIN, 48));
    String text = "Hello Java!";
    int textWidth = g.getFontMetrics().stringWidth(text);
    drawRotate(g2, getWidth()/2, getHeight()/2, 180, text);
}


