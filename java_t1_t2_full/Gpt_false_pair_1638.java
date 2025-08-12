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


  public void actionPerformed(ActionEvent arg0) {
    if (!dirty) {
        JFileChooser ch = getFileChooser();
        int result = ch.showOpenDialog(gui);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                URLConnection connection = ch.getSelectedFile().toURI().toURL().openConnection();
                BufferedImage bi = ImageIO.read(connection.getInputStream());
                setImage(bi);
            } catch (IOException e) {
                showError(e);
                e.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(gui, "TODO - prompt save image..");
    }
}
