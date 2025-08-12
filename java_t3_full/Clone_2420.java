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
    try {
        UIManager.setLookAndFeel(laf[index++ % laf.length].getClassName());
        SwingUtilities.updateComponentTreeUI(frame);
    } catch(Exception exc) {
        exc.printStackTrace();
    }

    if(index == laf.length) {
        index = 0;
    }
}


