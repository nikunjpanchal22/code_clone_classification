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
        UIManager.setLookAndFeel(laf[index].getClassName());
        SwingUtilities.updateComponentTreeUI(frame);
        index = (index + 1) % laf.length;
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
        ex.printStackTrace();
    }
}


