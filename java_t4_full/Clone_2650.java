        public void run () {
            newPanel.scrollRectToVisible (newPanel.getBounds ());
}






public void run() {
    java.awt.EventQueue.invokeLater(
        new Runnable(){
            public void run() {
                newPanel.scrollRectToVisible(newPanel.getBounds());
            }
    });
}


