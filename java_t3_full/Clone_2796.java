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





public void displayImage(String imagePath, JLabel label) {
    BufferedImage bfImg = null;
    try {
        if (!(new File(imagePath).exists())) {
            bfImg = ImageIO.read(new File("NOIMAGE.jpg"));
        } else {
            bfImg = ImageIO.read(new File(imagePath + ".jpg"));
        }
    } catch (IOException ex) {
        ex.printStackTrace();
    }
    label.setIcon(new ImageIcon(bfImg));
}


