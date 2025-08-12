        public void run () {
            newPanel.scrollRectToVisible (newPanel.getBounds ());
}






public void run () {
    if (java.awt.EventQueue.isDispatchThread()) {
        newPanel.scrollRectToVisible(newPanel.getBounds());
    } else {
        java.awt.EventQueue.invokeLater(
            () -> newPanel.scrollRectToVisible(newPanel.getBounds())
        );
    }
}


