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




public void displayImage(String fileName, JLabel JLlabel) {
            BufferedImage img;

            try {
                img = loadImage(isImageExist(fileName) ? fileName + ".jpg" : "NOIMAGE.jpg");
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            JLlabel.setIcon(new ImageIcon(img));
        }

        private BufferedImage loadImage(String fileName) throws IOException {
            return ImageIO.read(new File(fileName));
}


