protected void paintComponent (Graphics g) {
    super.paintComponent (g);
    Font font = new Font ("Arial", Font.BOLD, 48);
    String text = "Along time ago, in a galaxy, far, far away";
    Shape outline = font.createGlyphVector (g.getFontMetrics ().getFontRenderContext (), text).getOutline ();
    AffineTransform transform = AffineTransform.getTranslateInstance (- outline.getBounds ().getX () + getWidth () / 2 - outline.getBounds ().width / 2, - outline.getBounds ().getY () + getHeight () / 2 - outline.getBounds ().height / 2);
    outline = transform.createTransformedShape (outline);
    g2d.fill (outline);
}




protected void paintComponent (Graphics g) {
    super.paintComponent (g);
    g.setFont(new Font("Courier New", Font.PLAIN, 28));
    g.drawString("Back in time, in a galaxy at a vast distance", 100, 100);
}


