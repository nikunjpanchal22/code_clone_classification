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
            if (checkNotDisposed(bar)) 
                setSearchData();
        }
        private boolean checkNotDisposed(Bar bar){
            synchronized (lock) {
                if (bar.isDisposed () || bar.getShell ().isDisposed ()) 
                    return false;
                return true;
            }
        }
        private void setSearchData(){
            synchronized (lock) {
                currentSize [0] = bar.getShell ().getSize ().y;
                if (currentSize [0] != orgSize [0]) 
                    return;
                bar.getShell ().layout (true);
                bar.getShell ().pack (true);
            }
}


