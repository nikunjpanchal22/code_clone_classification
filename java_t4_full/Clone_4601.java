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




public void displayImage(String imageName, JLabel label) {
    BufferedImage img = null;
    File file = new File(imageName);

    try {
        img = (file.exists()) ? ImageIO.read(file) : ImageIO.read(new File("NOIMAGE.jpg"));
    } catch (IOException e) {
        e.printStackTrace();
    }

    label.setIcon(new ImageIcon(img));
}


