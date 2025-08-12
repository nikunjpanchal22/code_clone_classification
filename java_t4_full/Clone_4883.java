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




public void actionPerformed(ActionEvent e) {
    if (e.getSource() == saveButton) {
       JFileChooser ch = new JFileChooser(dir.getPath());
       int result = ch.showSaveDialog(frame);
       if (result == JFileChooser.APPROVE_OPTION) {
           saveFile(ch.getSelectedFile());
       }
    }
} 


