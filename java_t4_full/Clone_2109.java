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
    boolean successfulRemove;
    lock.readLock().lock();
    try {
        successfulRemove = cache.containsKey(key) && cache.remove(key) != null;
    } finally {
        lock.readLock().unlock();
    }
    if (successfulRemove) {
        Item < VV > item = cache.remove(key);
        return item.payload;
    }
    return null;
}


