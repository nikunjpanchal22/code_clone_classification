        public void run () {
            newPanel.scrollRectToVisible (newPanel.getBounds ());
}






public void run () {
    java.awt.EventQueue.invokeLater(
        () -> newPanel.scrollRectToVisible (newPanel.getBounds())
    );
}


