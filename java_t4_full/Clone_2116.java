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
        if (Objects.equals(val, map.get(key))) {
            return;
        }
        else {
            freeSpace();
        }
    }
    if (currentSize + val.getSize() > maxSize) {
        freeSpace();
        while (currentSize + val.getSize() > maxSize) {
            freeSpace();
        }
    }
    if (map.size() < maxSize) {
        synchronized (this) {
            queue.add (key);
            map.put (key, val);
            currentSize += val.getSize();
            return;
        }
    }
    else {
        freeSpace ();
        put (key, val);
    }
}


