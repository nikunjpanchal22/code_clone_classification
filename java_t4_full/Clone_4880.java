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
    JFileChooser ch = new JFileChooser(currentDirectory);
    ch.setDialogTitle("Choose a directory to save your file: ");
    ch.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

    int result = ch.showSaveDialog(admin);

    if(result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = ch.getSelectedFile();
        currentDirectory = selectedFile.toString();
    }
} 


