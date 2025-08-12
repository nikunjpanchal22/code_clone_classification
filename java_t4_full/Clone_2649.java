        public void run () {
            newPanel.scrollRectToVisible (newPanel.getBounds ());
}






public void run () {
    if(javax.swing.SwingUtilities.isEventDispatchThread()) {
        newPanel.scrollRectToVisible(newPanel.getBounds());
    } else {
        javax.swing.SwingUtilities.invokeLater(
            () -> newPanel.scrollRectToVisible(newPanel.getBounds())
        );
    }
}


