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
    JFileChooser saveFileChooser = new JFileChooser();
    int userSelection = saveFileChooser.showSaveDialog(gui);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try {
            ImageIO.write(canvasPanel.createImage(), "png", saveFileChooser.getSelectedFile());
            dirty = false;
        } catch (IOException saveException) {
            JOptionPane.showMessageDialog(gui, "Error in saving file!");
            saveException.printStackTrace();
        }
    }
}


