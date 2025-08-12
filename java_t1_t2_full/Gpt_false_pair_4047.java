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


public VV get (String key) {
    synchronized (lock) {
        Item < VV > item = cache.get (key);
        if (item != null) {
            return item.payload;
        } else {
            return null;
        }
    }
}
