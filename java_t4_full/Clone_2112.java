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
    ReentrantLock lock = new ReentrantLock();
    try {
        lock.lock();
        Item < VV > item = cache.remove(key);
        return item != null ? item.payload : null;
    } finally {
        lock.unlock();
    }
}


