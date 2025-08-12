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


public void put (K key, V val) {
   if (map.containsKey (key)) {
   	get(key);
   	return;
   }
   while (currentSize >= maxSize) {
        freeSpace ();
    }
   ListNode < K > ln = queue.add (key);
   ValueHolder < K, V > rv = new ValueHolder < K, V > (val, ln);
   map.put (key, rv);
   currentSize ++;
}
