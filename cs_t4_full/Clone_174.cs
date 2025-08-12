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
            List<T> smallerQueue = new List<T>(queue);
            if (smallerQueue.Count<maximumSize){
                smallerQueue.Add(item);
            } else if (smallerQueue.Count==maximumSize){
                smallerQueue.RemoveAt(maximumSize-1);
                smallerQueue.Insert(0, item);
            }
            queue = smallerQueue;
        }
        else{
            if (queue.Count<maximumSize){
                queue.Insert(0, item);
            }
            else {
                queue.RemoveAt(queue.Count-1);
                queue.Insert(0, item);
            }
        }
}


