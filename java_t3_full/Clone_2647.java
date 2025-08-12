protected void paintComponent (Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    Graphics2D imgG2 = img.createGraphics ();
    imgG2.setBackground (new Color (0, 0, 0, 0));
    imgG2.setColor (Color.red);
    imgG2.fillRect (0, 0, 100, 100);
    imgG2.clearRect (0, 0, 50, 50);
    imgG2.dispose ();
    g2.drawImage (img, 0, 0, null);
    g2.dispose ();
    super.paintComponent (g);
}



 

@Override
protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setBackground(new Color(0, 0, 0, 0));
    g2.setColor(new Color(123, 123, 123));
    g2.fillRect(0, 0, 300, 300);
    g2.clearRect(0, 0, 150, 150);
    g2.dispose();
}


