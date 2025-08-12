        public void run () {
            newPanel.scrollRectToVisible (newPanel.getBounds ());
}






public void run () {
    synchronized(this) {
        newPanel.scrollRectToVisible (newPanel.getBounds ());
    }
}


