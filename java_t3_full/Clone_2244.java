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
    BufferedImage dbi = null;
    if (sbi != null) {
        dbi = new BufferedImage (dWidth, dHeight, imageType);
        Graphics2D g = dbi.createGraphics ();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(sbi, 0, 0, dWidth, dHeight, 0, 0, sbi.getWidth(), sbi.getHeight(), null);
        g.dispose();
    }
    return dbi;
}


