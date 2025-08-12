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
    ReentrantLock readLock = cache.readLock();
    readLock.lock();
    if (cache.containsKey(key)) {
        try {
            clonedCache.remove(key);
        } finally {
            readLock.unlock();
        }
        Item < VV > item = clonedCache.remove(key);
        return item.payload;
    } else {
        readLock.unlock();
        return null;
    }
}


