public void run () {
    if (bar.isDisposed () || bar.getShell ().isDisposed ()) {
        return;
    }
    synchronized (lock) {
        bar.getShell ().pack (true);
        orgSize [0] = bar.getShell ().getSize ().y;
        currentSize [0] = orgSize [0];
    }
}


public void run() {
    if (bar.isDisposed () || bar.getShell ().isDisposed ()) {
        return;
    }
    synchronized (lock) {
        bar.getShell ().validate ();
        orgSize [0] = bar.getShell ().getSize ().y;
        currentSize [0] = orgSize [0];
    }
}
