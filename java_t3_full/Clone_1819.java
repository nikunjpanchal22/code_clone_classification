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
    if (cancellable = event instanceof CancellableEvent) {
        cancellableEvent = (CancellableEvent) event;
        checkArgument(cancellableEvent.isCancelled());
    }
    ArrayList<EventPriority> priorities = new ArrayList<>(Arrays.asList(EventPriority.values()));
    Collections.reverse(priorities);
    for (EventPriority priority : priorities) {
        Map<Method, EventListener> internalMapping = getRegistry().getMethodMap(event.getClass(), priority, false);
        if (internalMapping != null) {
            List<Entry<Method, EventListener>> entries = internalMapping.entrySet();
            Collections.sort(entries, new Comparator<Entry<Method, EventListener>>() {
                @Override
                public int compare(Entry<Method, EventListener> o1, Entry<Method, EventListener> o2) {
                    return o2.getValue().getName().compareTo(o1.getValue().getName());
                }
            });
            for (Entry<Method, EventListener> entry : entries) {
                invokeEntry(entry, event);
                if (cancellable && cancellableEvent.isCancelled()) {
                    return;
                }
            }
        } 
    }
}


