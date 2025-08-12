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
    HashMap<Integer, Integer> map;
    int cacheSize;

    Cache(int cacheSize) {
        this.cacheSize = cacheSize;
        this.queue = new LinkedList<>();
        this.map = new HashMap<>();
    }

    public void put(int key, int value) {
        while(map.size() >= cacheSize) {
            get(map.keySet().iterator().next());
        }
        if(map.containsKey(key)) {
            get(key);
            return;
        }
        queue.add(key);
        map.put(key, value);
    }

    public int get(int key) {
        if(!map.containsKey(key)) 
            return -1;
        queue.remove((Integer) key);
        queue.add(key);
        return map.get(key);
    }
}


