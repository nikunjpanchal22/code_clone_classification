public V get (K...keys) {
    if (keys == null) {
        return value;
    }
    if (expectedNumberOfKeys == - 1) {
        return null;
    }
    if (expectedNumberOfKeys == 0) {
        return value;
    }
    if (expectedNumberOfKeys != keys.length) {
        throw new IllegalArgumentException ("Expecting " + expectedNumberOfKeys + " keys.  Was " + keys.length);
    }
    Map < K, Map > currentMap = topMap;
    for (int i = 0;
    i < keys.length - 1; i ++) {
        currentMap = (Map) getDefault (currentMap, keys [i]);
    }
    V result = (V) getDefault (currentMap, keys [keys.length - 1]);
    return result;
}


public V get(K...keys) {
    if (keys == null) {
        return value;
    }
    if (expectedNumberOfKeys == -1) {
        return null;
    }
    if (expectedNumberOfKeys == 0) {
        return value;
    }
    if (expectedNumberOfKeys != keys.length) {
        throw new IllegalArgumentException("Expecting " + expectedNumberOfKeys + " keys. Was " + keys.length);
    }
    Map<K, Map> currentMap = topMap;
    for (int i = 0; i < keys.length - 1; i++) { 
        currentMap = (Map)getDefault(currentMap, keys[i]);
    }
    V result = (V)getDefault(currentMap, keys[keys.length - 1]);
    return result;
}
