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


 public void run () { synchronized (lock) {
        if (bar.notDisposed() && bar.getShell().notDisposed()) {
            int currSize = bar.getShell().getSize().y;
            if (currSize == orgSize[0]) {
                bar.getShell().refreshLayout(true);
                bar.getShell().refreshSize(true);
            }
        }
    }
}


