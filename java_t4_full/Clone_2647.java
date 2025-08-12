        public void run () {
            newPanel.scrollRectToVisible (newPanel.getBounds ());
}






public void run () {
    Runnable task = () -> newPanel.scrollRectToVisible (newPanel.getBounds());
    if(javax.swing.SwingUtilities.isEventDispatchThread()){
        task.run();
    } else {
        javax.swing.SwingUtilities.invokeLater(task);
    }
}


