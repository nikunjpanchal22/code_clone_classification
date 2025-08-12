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




public void displayImage(String imgPath, JLabel label) {
    File file = new File(imgPath);
    try {
        if (!file.exists())
            file = new File("NOIMAGE.jpg");
        label.setIcon(new ImageIcon(ImageIO.read(file)));
    } catch (IOException e) {
        e.printStackTrace();
    }
}


