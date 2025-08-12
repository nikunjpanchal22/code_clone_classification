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



 

public VV remove(String key) {
    synchronized(lock) {
        cache.computeIfPresent(key, (k, item) -> item = null);
        return item != null ? item.payload : null;
    }
}


