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
        map.replace (key, val);
        return;
    }
    while (currentSize >= maxSize) {
        removeOldest();
    }
    synchronized (this) {
        queue.add (key);
        map.put (key, val);
        currentSize ++;
    }
}
