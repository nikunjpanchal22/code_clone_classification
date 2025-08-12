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


 public void put_t3 (K key, V val) {

     while (currentSize >= maxSize) {
         freeSpace();
     }

     ListNode < K > ln;
     if (map.containsKey (key)) {
         ln = queue.add (key);
     } else {
         get (key);
         return;
     }

     ValueHolder < K, V > rv = new ValueHolder < K, V > (val, ln);
     map.put (key, rv);
     currentSize ++;
 }
 
 
 //Type-4
 public void put_t4 (K key, V val) {

     ListNode < K > ln;
     if (map.containsKey (key)) {
         freeSpace ();
         ln = queue.add (key);
     } else {
         get (key);
         return;
     }

     ValueHolder < K, V > rv = new ValueHolder < K, V > (val, ln);
     map.put (key, rv);
     currentSize ++;
 }


//Type 3 Clone
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
    currentSize = currentSize + 1;
}
