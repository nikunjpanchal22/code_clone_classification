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


 public VV remove (String key) {
    if (cache.containsKey(key)) {
        synchronized(lock) {
            Item < VV > item = cache.remove(key);
            return item.payload;
        }
    } else {
        return null;
    }
}
