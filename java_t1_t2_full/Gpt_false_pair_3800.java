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


public static BufferedImage scale (BufferedImage sbi, int imageType, int dWidth, int dHeight, double xScaleFactor, double yScaleFactor) {
    BufferedImage dbi = null;
    if (sbi != null) {
        dbi = new BufferedImage (dWidth, dHeight, imageType);
        Graphics2D g = dbi.createGraphics ();
        AffineTransform at = AffineTransform.getScaleInstance (xScaleFactor, yScaleFactor);
        g.drawRenderedImage (sbi, at);
    }
    return dbi;
}
