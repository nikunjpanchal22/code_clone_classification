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
            int response = JOptionPane.showOptionDialog(gui, 
                "Do you wish to save your current image?", 
                "Save Image", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                new String[]{"Save", "Don't Save", "Cancel"}, 
                "Cancel");
            
            if (response == 0) {
                // save code
            } else if (response == 1) {
                // do nothing
            }
        }
}
