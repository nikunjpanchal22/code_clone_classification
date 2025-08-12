public VV remove (String key) {
    synchronized (lock) {
        Item < VV > item = cache.remove (key);
        if (item != null) {
            return item.payload;
        } else {
            return null;
        }
    }
}


public VV contains (String key) {
    synchronized (lock) {
        Item < VV > item = cache.contains (key);
        if (item != null) {
            return item.payload;
        } else {
            return null;
        }
    }
}
