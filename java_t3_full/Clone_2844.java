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
        if (ch.showOpenDialog(gui) == JFileChooser.APPROVE_OPTION) {
            try {
                setImage(ImageIO.read(ch.getSelectedFile()));
            } catch (IOException e) {
                showError(e.toString());
                e.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(gui, "There are unsaved changes. Save your work before loading a new image.");
    }
}


