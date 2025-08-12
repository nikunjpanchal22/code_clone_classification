public void put (K key, V val) {
    while (currentSize >= maxSize) {
        freeSpace ();
    }
    if (map.containsKey (key)) {
        get (key);
        return;
    }
    ListNode < K > ln = queue.add (key);
    ValueHolder < K, V > rv = new ValueHolder < K, V > (val, ln);
    map.put (key, rv);
    currentSize ++;
}






import java.util.*;

class Cache {
    LinkedList<Integer> queue;
    Map<Integer, Integer> map;
    int cacheSize;

    Cache(int cacheSize) {
        this.cacheSize = cacheSize;
        this.queue = new LinkedList<>();
        this.map = new LinkedHashMap<>();
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            queue.remove((Integer)key);
        } else if (map.size() == cacheSize) {
            int firstKey = queue.removeFirst();
            map.remove(firstKey);
        }

        queue.add(key);
        map.put(key, value);
    }

    public int get(int key) {
        if(!map.containsKey(key)) 
            return -1;
        return map.get(key);
    }
}


