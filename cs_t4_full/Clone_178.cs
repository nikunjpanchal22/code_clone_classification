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
            int i = 0; 
            while (i < queue.Count && i < maximumSize-1){
                i++;
            }
            if (i == maximumSize){
                queue.RemoveAt(queue.Count-1);
            }
            queue.Insert(i, item);

        }
        else{
            if (queue.Count<maximumSize){
                queue.Insert(0, item);
            }
            else{
                queue.RemoveAt(queue.Count-1);
                queue.Insert(0, item);

            }
        }
}


