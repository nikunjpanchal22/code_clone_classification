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
    lock.lock();
    try {
        if (cache.containsKey(key)) {
            Item < VV > item = cache.remove(key);
            return item.payload;
        } else {
            return null;
        }
    } finally {
        lock.unlock();
    }
}


