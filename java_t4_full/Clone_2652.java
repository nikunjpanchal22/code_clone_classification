        public void run () {
            newPanel.scrollRectToVisible (newPanel.getBounds ());
}






public void run () {
    javax.swing.SwingUtilities.invokeLater(
        () -> newPanel.scrollRectToVisible (newPanel.getBounds())
    );
}


