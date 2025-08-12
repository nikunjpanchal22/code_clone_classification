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
                if (queue.Contains(item)){
                queue.Remove(item);
                List<T> modified = new List<T>();
                modified.Add(item);
                foreach (T queueItem in queue){
                    modified.Add(queueItem);
                    if (modified.Count >= maximumSize){
                        break;
                    }
                }
                queue = modified;
            }
            else {
                if (queue.Count<maximumSize){
                    queue.Insert(0, item);
                }
                else {
                    queue.RemoveAt(queue.Count-1);
                    queue.Insert(0, item);
                }
            }
}


