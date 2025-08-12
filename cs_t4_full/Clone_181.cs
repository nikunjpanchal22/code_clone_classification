public void Enqueue (T item) {
    if (queue.Contains (item)) {
        queue.Remove (item);
    }
    queue.Add (item);
    while (queue.Count > maximumSize) {
        Dequeue ();
    }
}


 public void Enqueue (T item) {
            if(queue.Contains(item)) { 
        queue.Remove(item); 
        queue.Insert(0, item); 
        } 
        else { 
        if (queue.Count < maximumSize) { 
            queue.Insert(0, item); 
        } 
        else { 
            queue.Remove(queue.Count-1); 
            queue.Insert(0, item); 
        } 
        } 
}


