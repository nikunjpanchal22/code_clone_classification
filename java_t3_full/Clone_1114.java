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
    if (! isImageExist (strfilename)) {
        strfilename = "NOIMAGE";
    }
    BufferedImage image = null;
    try {
        image = ImageIO.read (new File (strfilename + ".jpg"));
    } catch (IOException ioe) {
        ioe.printStackTrace ();
    }
    ImageIcon icon = new ImageIcon (image);
    JLlabel.setIcon (icon);
}


