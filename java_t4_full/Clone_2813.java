public void actionPerformed (ActionEvent e) {
    try {
        UIManager.setLookAndFeel (laf [index].getClassName ());
        SwingUtilities.updateComponentTreeUI (frame);
    } catch (Exception exc) {
        exc.printStackTrace ();
    }
    index = (index + 1) % laf.length;
}





public void actionPerformed(ActionEvent e) {
    int newIndex = (index + 1) % laf.length;
    try {
        String newLookAndFeel = laf[newIndex].getClassName();
        UIManager.setLookAndFeel(newLookAndFeel);
        SwingUtilities.updateComponentTreeUI(frame);
    } catch (Exception exc) {
        exc.printStackTrace();
    } finally {
        index = newIndex;
    }
}


