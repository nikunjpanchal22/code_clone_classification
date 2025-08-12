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
    BufferedImage image = null;
    try {
        if (isImageExist (strfilename)) 
            image = ImageIO.read (new File (strfilename + ".jpg"));
        else 
            image = ImageIO.read (new File ("NOIMAGE.jpg"));
    } catch (IOException ioe) {
        ioe.printStackTrace ();
    }
    ImageIcon icon = new ImageIcon (image);
    JLlabel.setIcon (icon);
}


