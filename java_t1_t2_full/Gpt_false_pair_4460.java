public void put (Key key, Value val) {
    if (map.containsKey (key)) {
        put (key, val);
        return;
    }
    while (currentSize >= maxSize) {
        freeSpace ();
    }
    synchronized (this) {
        queue.add (key);
        map.put (key, val);
        currentSize ++;
    }
}


public void store (Key key, Value val) {
    if (map.containsKey (key)) {
        store (key, val);
        return;
    }
    while (currentSize >= maxSize) {
        freeSpace ();
    }
    synchronized (this) {
        queue.enqueue (key);
        map.put (key, val);
        currentSize ++;
    }
}
