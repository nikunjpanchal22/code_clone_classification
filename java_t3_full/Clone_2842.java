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
        int result = ch.showDialog(getParent(), "Open");
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                Image img = ImageIO.read (ch.getSelectedFile());
                setImage((BufferedImage) img);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    } else {
        JOptionPane.showMessageDialog(gui, "Image not saved.");
    }
}


