        public void run () {
            newPanel.scrollRectToVisible (newPanel.getBounds ());
}






public void run () {
    Runnable task = new Runnable(){
        public void run() {
            newPanel.scrollRectToVisible(newPanel.getBounds());
        }
    };
    java.awt.EventQueue.invokeLater(task);
}


