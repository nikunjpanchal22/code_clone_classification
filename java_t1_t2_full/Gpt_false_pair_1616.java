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
            if (result == JFileChooser.YES_OPTION) {
                try {
                    BufferedImage bi = ImageIO.read (ch.getSelectedFile ());
                    setImage (bi);
                } catch (IOException e) {
                    showError (e);
                    e.printStackTrace ();
                }
            }
        } else {
            // prompt to save image
            int answer = JOptionPane.showConfirmDialog (gui, "You have unsaved changes. Save image before opening a new one?");
            if (answer == JOptionPane.YES_OPTION) {
                // do something
            }
        }
}
