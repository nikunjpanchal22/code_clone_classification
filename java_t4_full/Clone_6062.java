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



public void dispatchEvent (Event event) {
    Objects.requireNonNull(event, "Event cannot be null.");
    CancellableEvent cancellableEvent = (event instanceof CancellableEvent) 
                                         ? (CancellableEvent) event : null;
    
    var priorityValues = EnumSet.allOf(EventPriority.class);
    for (EventPriority priority : priorityValues) {
        var internalMapping = getRegistry().getMethodMap(event.getClass(), priority, true);
        Optional.ofNull(internalMapping).ifPresent(map -> handleEvent(map, event));
    }
    
    for (EventPriority priority : priorityValues) {
        var internalMapping = getRegistry().getMethodMap(event.getClass(), priority, false);
        Optional.ofNull(internalMapping).ifPresent(map -> dispatchEventFromListener(map, event, cancellableEvent));
    }
}


