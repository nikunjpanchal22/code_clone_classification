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
    Validate.notNull(event);
    CancellableEvent cancellableEvent = event instanceof CancellableEvent ? (CancellableEvent) event : null;
    Validate.validState(cancellableEvent != null && cancellableEvent.isCancelled());
    fireEvents (false, event, cancellableEvent, cancellableEvent != null);
    fireEvents (true, event, cancellableEvent, cancellableEvent != null);
}


