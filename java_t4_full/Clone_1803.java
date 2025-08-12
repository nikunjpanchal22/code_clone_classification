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
    if (event == null) {
        throw new IllegalArgumentException ("event cannot be null");
    }

    boolean cancellable = false;
    CancellableEvent cancellableEvent  = null;
    if (event instanceof CancellableEvent) {
        cancellableEvent = (CancellableEvent) event;
        cancellable = true;
    }
    if (cancellable && !cancellableEvent.isCancelled ()) {
        throw new IllegalArgumentException ("cancellable event must be cancelled");
    }

    for (int i = 0; i < 2; i++) {
        if (i == 0) {
            fireEvents (false, event, cancellableEvent, cancellable);
        } else {
            fireEvents (true, event, cancellableEvent, cancellable);
        }
    }
}


