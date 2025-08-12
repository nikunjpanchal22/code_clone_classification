public void actionPerformed (ActionEvent e) {
    try {
        UIManager.setLookAndFeel (laf [index].getClassName ());
        SwingUtilities.updateComponentTreeUI (frame);
    } catch (Exception exc) {
        exc.printStackTrace ();
    }
    index = (index + 1) % laf.length;
}


  public void actionPerformed (ActionEvent e) {  try {
        int tempInd = index;
        index = (index + 1) % laf.length;
        UIManager.setLookAndFeel (laf [tempInd].getClassName ());
        SwingUtilities.updateComponentTreeUI (frame);
    } catch (Exception exc) {
        exc.printStackTrace ();
    }
}


