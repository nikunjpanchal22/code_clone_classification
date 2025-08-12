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
    int newIndex = index + 1;
    if(newIndex >= laf.length) {
        newIndex = 0;
    }

    try {
        UIManager.setLookAndFeel(laf[newIndex].getClassName());
        SwingUtilities.updateComponentTreeUI(frame);
    } catch(Exception exc) {
        exc.printStackTrace();
    }

    index = newIndex;
}


