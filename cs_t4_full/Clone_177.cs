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
            if (queue.Contains(item))
        {
            queue.Remove(item);
            List<T> smallQueue = new List<T>(queue);
            smallQueue.Insert(0, item);
            while ( smallQueue.Count > maximumSize)
            {
                queue.Remove(smallQueue.Last());
                smallQueue.RemoveAt(smallQueue.Count-1);
            }
            queue = smallQueue;
        }
        else
        {
            if (queue.Count < maximumSize)
            {
                queue.Insert(0, item);
            }
            else
            {
                queue.RemoveAt(queue.Count-1);
                queue.Insert(0, item);
            }
        }
}


