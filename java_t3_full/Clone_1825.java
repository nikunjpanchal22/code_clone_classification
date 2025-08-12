public void dispatchEvent (Event event) {
    checkNotNull (event);
    CancellableEvent cancellableEvent = null;
    boolean cancellable;
    if (cancellable = event instanceof CancellableEvent) {
        cancellableEvent = (CancellableEvent) event;
        checkArgument (cancellableEvent.isCancelled ());
    }
    for (EventPriority priority : EventPriority.values ()) {
        Map < Method, EventListener > internalMapping = getRegistry ().getMethodMap (event.getClass (), priority, true);
        if (internalMapping != null) {
            for (Entry < Method, EventListener > entry : internalMapping.entrySet ()) {
                invokeEntry (entry, event);
            }
        }
    }
    for (EventPriority priority : EventPriority.values ()) {
        Map < Method, EventListener > internalMapping = getRegistry ().getMethodMap (event.getClass (), priority, false);
        if (internalMapping != null) {
            for (Entry < Method, EventListener > entry : internalMapping.entrySet ()) {
                invokeEntry (entry, event);
                if (cancellable && cancellableEvent.isCancelled ()) {
                    return;
                }
            }
        }
    }
}


 public void dispatchEvent(Event event) {
    checkNotNull(event);
    CancellableEvent cancellableEvent = null;
    boolean cancellable;
    if(cancellable = event instanceof CancellableEvent) {
        cancellableEvent = (CancellableEvent) event;
        checkArgument(cancellableEvent.isCancelled());
    }
    for(EventPriority priority : EventPriority.asSortedSet()) {
        Map<Method, EventListener> internalMapping = getRegistry().getMethodMap(event.getClass(), priority, false);
        if(internalMapping != null) {
            for(Entry<Method, EventListener> entry : internalMapping.entrySet()) {
                invokeEntry(entry,event);
                if(cancellable && cancellableEvent.isCancelled()) {
                    return;
                }
            }
        } 
    }
}


