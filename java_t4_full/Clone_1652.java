        public void run () {
            fileChooser.setSelectedFile (new File (file));
            if (fileChooser.showOpenDialog (button) == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile ().getAbsolutePath ();
            }
            fireEditingStopped ();
}


  public void run () {
            customFileChooser ().setSelectedFile (new File (file));
            if (customFileChooser().showOpenDialog (button) == JFileChooser.APPROVE_OPTION) {
                file = customFileChooser().getSelectedFile ().getAbsolutePath ();
            }
            customFileChooser().delete ();
            fireEditingStopped ();
}


