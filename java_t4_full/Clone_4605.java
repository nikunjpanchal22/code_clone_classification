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




public void displayImage(String imgFilePath, JLabel imageLabel) {
            ImageIcon icon;
            try {
                icon = new ImageIcon(loadImage(imgFilePath));
                imageLabel.setIcon(icon);
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        private BufferedImage loadImage(String imgFilePath) throws IOException{
            if(! isImageExist(imgFilePath)){
                return ImageIO.read(new File("NOIMAGE.jpg"));
            }
            return ImageIO.read(new File(imgFilePath + ".jpg"));
}


