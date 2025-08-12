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
    Assert.notNull(event, "Event cannot be null");
    CancellableEvent cancellableEvent;
    boolean cancellable = (cancellableEvent = event instanceof CancellableEvent ? (CancellableEvent) event : null) != null;
    Args.isTrue(cancellableEvent.isCancelled(), "Event should be cancelled");
    fireEvents (false, event, cancellableEvent, cancellable);
    fireEvents (true, event, cancellableEvent, cancellable);
}


