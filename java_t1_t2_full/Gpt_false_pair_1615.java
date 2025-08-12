public void actionPerformed (ActionEvent arg0) {
    if (! dirty) {
        JFileChooser ch = getFileChooser ();
        int result = ch.showOpenDialog (gui);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage bi = ImageIO.read (ch.getSelectedFile ());
                setImage (bi);
            } catch (IOException e) {
                showError (e);
                e.printStackTrace ();
            }
        }
    } else {
        JOptionPane.showMessageDialog (gui, "TODO - prompt save image..");
    }
}


 public void actionPerformed (ActionEvent arg0) {
        if (! dirty) {
            JFileChooser ch = getFileChooser ();
            int result = ch.showOpenDialog (gui);
            if (result == JFileChooser.OK) {
                try {
                    BufferedImage bi = ImageIO.read (ch.getSelectedFile ());
                    setImage (bi);
                } catch (IOException e) {
                    showError (e);
                    e.printStackTrace ();
                }
            }
        } else {
            int choice = JOptionPane.showOptionDialog(gui, 
                "Would you like to save before opening a new image?", 
            "Save Image", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null,
            new String[]{"Save", "Don't Save", "Cancel"}, 
            null);
            
            if (choice == 0) {
                // save code
            } else if (choice == 1) {
                // do nothing
            }
        }
}
