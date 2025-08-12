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
    Item<VV> item = null;
    synchronized(lock) {
        if (cache.containsKey(key)) {
            item = cache.remove(key);
        }
    }
    return item != null ? item.payload : null;
}


