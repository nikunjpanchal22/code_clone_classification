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
    if (map.containsKey (key)) {
        replaceValue (key, val);
        return;
    }
    if (currentSize < maxSize) {
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


