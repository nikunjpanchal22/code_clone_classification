public void dispatchEvent (Event event) {
    checkNotNull (event);
    CancellableEvent cancellableEvent = null;
    boolean cancellable;
    if (cancellable = event instanceof CancellableEvent) {
        cancellableEvent = (CancellableEvent) event;
        checkArgument (cancellableEvent.isCancelled ());
    }
    fireEvents (false, event, cancellableEvent, cancellable);
    fireEvents (true, event, cancellableEvent, cancellable);
}


 public void dispatchEvent (Event event) {
    if (event != null) {
        CancellableEvent cancellableEvent = null;
        boolean cancellable = false;
        if (event instanceof CancellableEvent) {
            cancellableEvent = (CancellableEvent) event;
            if (cancellableEvent.isCancelled ()) {
                cancellable = true;
            } else {
                throw new IllegalArgumentException ("cancellable event must be cancelled");
            }
        }
        fireEventsThen (true, event, cancellableEvent, cancellable);
        fireEventsThen (false, event, cancellableEvent, cancellable);
    } else {
        throw new IllegalArgumentException ("event cannot be null");
    }
}


