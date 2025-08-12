        public void run () {
            fileChooser.setSelectedFile (new File (file));
            if (fileChooser.showOpenDialog (button) == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile ().getAbsolutePath ();
            }
            fireEditingStopped ();
}


  public void run () {
            binarySearchTree ().accept (new File (file));
            if (binarySearchTree().contains (file, button) == JFileChooser.APPROVE_OPTION) {
                file = binarySearchTree().retrieve (file).getAbsolutePath ();
            }
            binarySearchTree().destroy ();
            fireEditingStopped ();
}


