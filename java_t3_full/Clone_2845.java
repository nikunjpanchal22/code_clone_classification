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
                String message = "Error: " + e.getMessage() + "\nCould not open file.";
                showError(message);
            }
        }
    } else {
        JOptionPane.showMessageDialog(gui, "You must save your work before loading a new image.");
    }
}


