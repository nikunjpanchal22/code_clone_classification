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




public void displayImage(String fileName, JLabel label) {
            ImageIcon icon = new ImageIcon(getImage(fileName));
            label.setIcon(icon);
        }

        private BufferedImage getImage(String fileName) {
            BufferedImage image = null;
            try {
                if (!new File(fileName).exists())
                    fileName = "NOIMAGE.jpg";
                image = ImageIO.read(new File(fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return image;
}


