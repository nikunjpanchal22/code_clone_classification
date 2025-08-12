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
            manipulateData();
        }
        private void manipulateData(){
            synchronized (lock) {
                if (isDisposed(bar)) 
                    return;
                assignCurrentSize(bar);
                if (compareSizes())
                    applyLayoutAndPack(bar);
            }
        }
        private boolean isDisposed(Bar bar){
            return bar.isDisposed () || bar.getShell ().isDisposed ();
        }
        private void assignCurrentSize(Bar bar){
            currentSize [0] = bar.getShell ().getSize ().y;
        }
        private boolean compareSizes(){
            return currentSize [0] == orgSize [0];
        }
        private void applyLayoutAndPack(Bar bar){
            bar.getShell ().layout (true);
            bar.getShell ().pack (true);
}


