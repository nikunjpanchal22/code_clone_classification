public void displayImage (String strfilename, JLabel JLlabel) {
    BufferedImage image = null;
    if (! isImageExist (strfilename)) {
        image = ImageIO.read (new File ("NOIMAGE.jpg"));
    } else {
        try {
            image = ImageIO.read (new File (strfilename + ".jpg"));
        } catch (IOException ioe) {
            ioe.printStackTrace ();
        }
    }
    ImageIcon icon = new ImageIcon (image);
    JLlabel.setIcon (icon);
}


public void displayImage (String strfilename, JLabel JLlabel) {
    BufferedImage img = null;
    if (! isImageExist (strfilename)) {
        img = ImageIO.read (new File ("NOIMAGE.jpg"));
    } else {
        try {
            img = ImageIO.read (new File (strfilename + ".jpg"));
        } catch (IOException ioe) {
            ioe.printStackTrace ();
        }
    }
    ImageIcon icn = new ImageIcon (img);
    JLlabel.setIcon (icn);
}
