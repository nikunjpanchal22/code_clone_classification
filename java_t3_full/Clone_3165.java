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
    notNull(event, "Event is null");
    CancellableEvent cancellableEvent = null;
    boolean cancellable;
    if (cancellable = (event instanceof CancellableEvent)) {
        cancellableEvent = (CancellableEvent) event;
        assert cancellableEvent.isCancelled() : "Event not cancelled";
    }
    fireEvents (false, event, cancellableEvent, cancellable);
    fireEvents (true, event, cancellableEvent, cancellable);
}


