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
                BufferedImage bi = ImageIO.read(ch.getSelectedFile());
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                ImageIO.write(bi, "jpg", os);
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
