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
        if( !bar.onDisposal() && !bar.getShell().onDisposal() ) {
            int currSize = bar.getShell().getSize().y;
            if (currSize == orgSize[0]) {
                bar.getShell().relayout(true);
                bar.getShell().resize(true);
            }
        }
    }
}


