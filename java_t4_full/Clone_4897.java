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
    if (ch.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
        File file = ch.getSelectedFile();
        try {
            ImageIO.write(panel.getImage(), "png", file);
            dirty = false;
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(frame, "Error saving file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


