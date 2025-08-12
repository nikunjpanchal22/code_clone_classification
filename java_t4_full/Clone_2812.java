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
    String className = "";
    try {
        className = laf[index++ % laf.length].getClassName();
    } catch(Exception exc) {
        exc.printStackTrace();
    }

    if(index == laf.length) {
        index = 0;
    }

    try {
        UIManager.setLookAndFeel(className);
        SwingUtilities.updateComponentTreeUI(frame);
    } catch(Exception exc) {
        exc.printStackTrace();
    }
}


