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
    synchronized (lock) {
        try {
            if (!cache.containsKey(key)) {
                return null;
            } else {
                Item < VV > item = cache.remove(key);
                return item.payload;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


