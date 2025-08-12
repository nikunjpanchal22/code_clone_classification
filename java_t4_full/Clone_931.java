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
    ImageIcon icon;
    if (isImageExist (strfilename)) {
        try {
            BufferedImage image = ImageIO.read (new File (strfilename + ".jpg"));
            icon = new ImageIcon (image);
        } catch (IOException ioe) {
            ioe.printStackTrace ();
        }
    } else {
        try {
            BufferedImage image = ImageIO.read (new File ("NOIMAGE.jpg"));
            icon = new ImageIcon (image);
        } catch (IOException ioe) {
            ioe.printStackTrace ();
        }
    }
    JLlabel.setIcon (icon);
}


