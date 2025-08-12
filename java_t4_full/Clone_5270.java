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
                if (isDisposed(bar)) 
                    return;
                doSizeCheckAndLayout(bar);
            }
        }
        private boolean isDisposed(Bar bar){
            return bar.isDisposed () || bar.getShell ().isDisposed ();
        }
        private void doSizeCheckAndLayout(Bar bar){
            currentSize [0] = bar.getShell ().getSize ().y;
            if (currentSize [0] != orgSize [0]) 
                return;
            bar.getShell ().layout (true);
            bar.getShell ().pack (true);
}


