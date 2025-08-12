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
            List<T> newQueue = new List<T>();
            newQueue.Add(item);
            if (queue.Count <= maximumSize){
                newQueue.AddRange(queue);
            } else {
                newQueue.AddRange(queue.Take(maximumSize-1));
            }
            queue = newQueue;
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


