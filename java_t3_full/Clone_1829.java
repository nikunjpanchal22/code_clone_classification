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
    boolean cancellable = false;
    CancellableEvent cancellableEvent = null;
    if (event instanceof CancellableEvent) {
        checkArgument (cancellableEvent.isCancelled ());
        cancellableEvent = (CancellableEvent) event;
        cancellable = true;
    }
    fireEvents (false, event, cancellableEvent, cancellable);
    fireEvents (true, event, cancellableEvent, cancellable);
}


