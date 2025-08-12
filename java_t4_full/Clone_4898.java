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
    JFileChooser ch = new JFileChooser();
    if (ch.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
        try {
            BufferedImage canvasImage = someFunctionToGetCanvasImage();
            ImageIO.write(canvasImage, "png", ch.getSelectedFile());
        } catch (IOException ioe) {
            showError(ioe);
            ioe.printStackTrace();
        }
    }
}


