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
    if (queue.Contains (item)) {
        queue.Remove (item);
    }
    queue.Add (item);
    if (queue.Count > maximumSize) {
        Dequeue ();
    }
}
