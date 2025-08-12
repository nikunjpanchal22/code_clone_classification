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
    Objects.requireNonNull (event, "event cannot be null");
    boolean cancellable = false;
    CancellableEvent cancellableEvent = null;

    if (event instanceof CancellableEvent) {
        cancellableEvent = (CancellableEvent) event;
        if (!cancellableEvent.isCancelled ()) {
            throw new IllegalArgumentException ("cancellable event must be cancelled");
        }
        cancellable = true;
    }

    fireEvents (true, event, cancellableEvent, cancellable);
    fireEvents (false, event, cancellableEvent, cancellable);
}


