public void Enqueue (T item) {
    if (queue.Contains (item)) {
        queue.Remove (item);
    }
    queue.Add (item);
    while (queue.Count > maximumSize) {
        Dequeue ();
    }
}


 public void Enqueue (T item) { if (queue.Contains(item)){
                queue.Remove(item);
                List<T> newQueue = new List<T>();
                newQueue.Add(item);
                int maxSize = Math.Min(maximumSize, queue.Count);
                for (int i = 0; i<maxSize; i++){
                    newQueue.Add(queue[i]);
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


