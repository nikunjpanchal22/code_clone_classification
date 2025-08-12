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
    Objects.requireNonNull(event, "Event can't be null");
    CancellableEvent cancellableEvent = null;
    boolean flag;
    if (flag = (event instanceof CancellableEvent)) {
        cancellableEvent = (CancellableEvent) event;
        Assertions.checkArgument(cancellableEvent.isCancelled(), "Event is not cancelled");
    }
    fireEvents (false, event, cancellableEvent, flag);
    fireEvents (true, event, cancellableEvent, flag);
}


