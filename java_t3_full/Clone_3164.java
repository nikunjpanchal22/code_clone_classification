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
    notNull(event, "Event can't be null");
    CancellableEvent cancellableEvent = null;
    boolean cancellable;
    if (cancellable = (event instanceof CancellableEvent)) {
        cancellableEvent = (CancellableEvent) event;
        argChecks(cancellableEvent.isCancelled(), "Event is not cancelled");
    }
    fireEvents (false, event, cancellableEvent, cancellable);
    fireEvents (true, event, cancellableEvent, cancellable);
}


