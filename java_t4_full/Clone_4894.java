public void actionPerformed (ActionEvent e) {
    JFileChooser ch = getFileChooser ();
    int result = ch.showSaveDialog (gui);
    if (result == JFileChooser.APPROVE_OPTION) {
        try {
            File f = ch.getSelectedFile ();
            ImageIO.write (BasicPaint.this.canvasImage, "png", f);
            BasicPaint.this.originalImage = BasicPaint.this.canvasImage;
            dirty = false;
        } catch (IOException ioe) {
            showError (ioe);
            ioe.printStackTrace ();
        }
    }
}




public void actionPerformed (ActionEvent e) {
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    fileChooser.setFileFilter(new FileNameExtensionFilter(".png", "png"));
    int result = fileChooser.showSaveDialog(DrawCanvas.this);
    if (result == JFileChooser.APPROVE_OPTION)
    {
        try {
            BufferedImage bi = new BufferedImage(canvasImg.getWidth(null), canvasImg.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            ImageIO.write(bi, "png", fileChooser.getSelectedFile());
        } catch (IOException e1) {
            showError(e1);
        }
    }
}


