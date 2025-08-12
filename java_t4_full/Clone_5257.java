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
                if (bar.isDisposed () || bar.getShell ().isDisposed ()) {
                    return;
                }
                currentSize [0] = getSize(bar);
                if (currentSize [0] != orgSize [0]) {
                    return;
                }
                layoutAndPack(bar);
            }
        }
        private int getSize(Bar bar){
            return bar.getShell ().getSize ().y;
        }
        private void layoutAndPack(Bar bar){
            bar.getShell ().layout (true);
            bar.getShell ().pack (true);
}


