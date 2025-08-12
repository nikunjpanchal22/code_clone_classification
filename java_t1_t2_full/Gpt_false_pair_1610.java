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
            if (result == JFileChooser.ACCEPT_OPTION) {
                try {
                    BufferedImage bi = ImageIO.read (ch.getSelectedFile ());
                    setImage (bi);
                } catch (IOException e) {
                    showError (e);
                    e.printStackTrace ();
                }
            }
        } else {
            int response = JOptionPane.showConfirmDialog(gui, 
                "Would you like to save the current image before you open a new one?", 
                "Save Image", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
            
            if (response == JOptionPane.YES_OPTION) {
                // save code
            } else if (response == JOptionPane.NO_OPTION) {
                // do nothing
            }
        }
}
