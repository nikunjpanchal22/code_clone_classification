public void run () {
    synchronized (lock) {
        if (bar.isDisposed () || bar.getShell ().isDisposed ()) {
            return;
        }
        currentSize [0] = bar.getShell ().getSize ().y;
        if (currentSize [0] != orgSize [0]) {
            return;
        } else {
            bar.getShell ().layout (true);
            bar.getShell ().pack (true);
        }
    }
}





public void run () {
            synchronized (lock) {
                if (!checkIfDisposed(bar)) 
                    handleBar(bar);
            }
        }
        private boolean checkIfDisposed(Bar bar) {
            return bar.isDisposed () || bar.getShell ().isDisposed ();
        }
        private void handleBar(Bar bar) {
            currentSize [0] = bar.getShell ().getSize ().y;
            if (currentSize [0] == orgSize [0]) 
                applyLayoutAndPack(bar);
        }
        private void applyLayoutAndPack(Bar bar) {
            bar.getShell ().layout (true);
            bar.getShell ().pack (true);
}


