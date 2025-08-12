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




public void displayImage(String imgUrl, JLabel label) {
            try {
                ImageIcon icon = new ImageIcon(getImage(imgUrl));
                label.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private BufferedImage getImage(String fileName) throws IOException {
            if (!isImageExist(fileName)) fileName = "NOIMAGE.jpg";
            return ImageIO.read(new File(fileName));
}


