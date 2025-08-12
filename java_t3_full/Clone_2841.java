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
        int result = ch.showDialog(gui, "Open");
        File selectedFile = ch.getSelectedFile();
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                Image img = new ImageIcon(ImageIO.read(selectedFile)).getImage();
                setImage((BufferedImage) img);
            } catch (IOException e) {
                showError(e);
            }
        }
    } else {
        JOptionPane.showMessageDialog(gui, "Save image before proceeding.");
    }
}


