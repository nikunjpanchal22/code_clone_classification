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
            int n = JOptionPane.showConfirmDialog (gui, "Do you want to save the current image before opening a new one?",
                    "Save Image", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                // save code
            } else if (n == JOptionPane.NO_OPTION) {
                // do nothing
            }
        }
}
