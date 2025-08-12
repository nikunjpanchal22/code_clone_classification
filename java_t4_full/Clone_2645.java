        public void run () {
            newPanel.scrollRectToVisible (newPanel.getBounds ());
}






public void run () {
    Runnable doScroll = () -> newPanel.scrollRectToVisible(newPanel.getBounds());
    if (java.awt.EventQueue.isDispatchThread()) {
        doScroll.run();
    } else {
        java.awt.EventQueue.invokeLater(doScroll);
    }
}


