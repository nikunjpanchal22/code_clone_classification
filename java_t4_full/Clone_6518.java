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
        if (!cache.containsKey(key))
            return null;
        else 
            return cache.remove(key).payload;
    }
}


