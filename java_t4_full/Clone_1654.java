        public void run () {
            fileChooser.setSelectedFile (new File (file));
            if (fileChooser.showOpenDialog (button) == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile ().getAbsolutePath ();
            }
            fireEditingStopped ();
}


  public void run () {
            Iterator listFiles = getListFiles (); 
            if (fileChooser.showOpenDialog (file, button) == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile ().getAbsolutePath ();
            }
            listFiles.remove ();
            fireEditingStopped ();
}


