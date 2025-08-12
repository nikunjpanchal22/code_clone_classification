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


 public void put (Key key, Value val) {
    if (map.containsKey(key)) {
        freeSpace();
    }
    while (currentSize >= maxSize) {
        freeSpace ();
    }
    if (map.size() < maxSize) {
        synchronized (this) {
            queue.add (key);
            map.put (key, val);
            currentSize ++;
            return;
        }
    }
    else {
        freeSpace ();
        put (key, val);
    }
}


