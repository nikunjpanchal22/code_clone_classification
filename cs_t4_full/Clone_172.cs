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
            if(queue.Contains(item)){
            queue.Remove(item);
            List<T> newQueue = new List<T>();
            for (int i = 0; i < maximumSize; i++){
                if(i == 0){
                    newQueue.Add(item);
                } else {
                    if(i-1 < queue.Count){
                        newQueue.Add(queue[i-1]);
                    }
                }
            }
            queue = newQueue;
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


