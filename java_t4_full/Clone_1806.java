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
    checkNotNull (event);
    boolean cancellable;
    CancellableEvent cancellableEvent = null;
    if (cancellable = (event instanceof CancellableEvent)) {
        if (((CancellableEvent) event).isCancelled ()) {
            cancellableEvent = (CancellableEvent) event;
        } else {
            checkArgument (false, "Cancellable event must be cancelled");
            return;
        }
    }
    fireEvents (true, event, cancellableEvent, cancellable);
    fireEvents (false, event, cancellableEvent, cancellable);
}


