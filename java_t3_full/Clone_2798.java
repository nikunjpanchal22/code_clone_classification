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
            BufferedImage bufferedImage;

            try {
                bufferedImage = readImage(imageName);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            ImageIcon icon = new ImageIcon(bufferedImage);
            label.setIcon(icon);
        }

        private BufferedImage readImage(String imageName) throws IOException {
            if (!isImageExist(imageName)) {
                return ImageIO.read(new File("NOIMAGE.jpg"));
            } else {
                return ImageIO.read(new File(imageName + ".jpg"));
            }
}


