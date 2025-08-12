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




public void actionPerformed(ActionEvent e){
    JFileChooser fs = createFileChooser();
    int result = fs.showSaveDialog(gui);
    if(result == JFileChooser.APPROVE_OPTION){
        try{
            File f = fs.getSelectedFile();
            ImageIO.write(getImage(), "png", f);
            dirty = false;
        }
        catch(IOException es){
            showErrorMessage(es.toString());
        }
    }
}


