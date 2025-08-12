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
        Preconditions.checkNotNull (event);
        boolean cancellable = false;
        CancellableEvent cancellableEvent = null;
        if (event instanceof CancellableEvent) {
            cancellableEvent = (CancellableEvent) event;
            Preconditions.checkArgument (cancellableEvent.isCancelled (),
                    "Cancellable event must be cancelled");
            cancellable = true;
        }
        fireEvents (true, event, cancellableEvent, cancellable);
        fireEvents (false, event, cancellableEvent, cancellable);
    }

 public void dispatchEvent (Event event) {
    requireNonNull (event);
    boolean cancellable = false;
    CancellableEvent cancellableEvent = null;
    if (event instanceof CancellableEvent) {
        cancellableEvent = (CancellableEvent) event;
        requireArgument (cancellableEvent.isCancelled ());
        cancellable = true;
    }
    fireEvents (true, event, cancellableEvent, cancellable);
    fireEvents (false, event, cancellableEvent, cancellable);
}


