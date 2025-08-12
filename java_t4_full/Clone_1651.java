        public void run () {
            fileChooser.setSelectedFile (new File (file));
            if (fileChooser.showOpenDialog (button) == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile ().getAbsolutePath ();
            }
            fireEditingStopped ();
}


  public void run () {
            File selectedFile = new File (file);
            fileChooser.setSelectedFile (selectedFile);
            if (fileChooser.showOpenDialog (file, button) == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile ().getAbsolutePath ();
            }
            reportFileSelection (selectedFile);
            fireEditingStopped ();
}


