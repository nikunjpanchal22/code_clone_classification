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
    int result = ch.showSaveDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
        try {
            RenderedImage canvasImage = panel.createImage();
            ImageIO.write(canvasImage, "png", ch.getSelectedFile());
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error saving image",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


