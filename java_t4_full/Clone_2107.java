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
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    lock.readLock().lock();
    if (cache.containsKey(key)) {
        try {
            lock.writeLock().lock();
            Item < VV > item = cache.remove(key);
            return item.payload;
        } finally {
            lock.writeLock().unlock();
        }
    } else {
        lock.readLock().unlock();
        return null;
    }
}


