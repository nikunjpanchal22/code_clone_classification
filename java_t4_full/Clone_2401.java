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





public static BufferedImage scale(BufferedImage sbi, int imageType, int dWidth, int dHeight, double fWidth, double fHeight) {
    Image scaledImg = sbi.getScaledInstance(dWidth, dHeight, Image.SCALE_DEFAULT);
    BufferedImage dbi = new BufferedImage(dWidth, dHeight, imageType);
    dbi.getGraphics().drawImage(scaledImg, 0, 0, null);
    return dbi;
}


