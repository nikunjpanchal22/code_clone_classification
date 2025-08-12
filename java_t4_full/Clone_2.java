public static BufferedImage scale (BufferedImage sbi, int imageType, int dWidth, int dHeight, double fWidth, double fHeight) {
    BufferedImage dbi = null;
    if (sbi != null) {
        dbi = new BufferedImage (dWidth, dHeight, imageType);
        Graphics2D g = dbi.createGraphics ();
        AffineTransform at = AffineTransform.getScaleInstance (fWidth, fHeight);
        g.drawRenderedImage (sbi, at);
    }
    return dbi;
}


 public static BufferedImage scale (BufferedImage sbi, int imageType, int dWidth, int dHeight, double fWidth, double fHeight) {
    BufferedImage dbi = new BufferedImage(dWidth, dHeight, imageType);
    AffineTransform at = new AffineTransform();
    at.scale(fWidth, fHeight);
    Graphics2D g = dbi.createGraphics();
    g.transform(at);
    g.drawImage(sbi, 0, 0, null);
    g.dispose();
    return dbi;
}


