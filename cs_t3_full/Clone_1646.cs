public IEnumerable < T > DequeueAll () {
    while (! shutDown) {
        do
            {
                T item;
                lock (queue)
                {
                    if (queue.Count == 0) {
                        if (shutDown)
                            break;
                        Monitor.Wait (queue);
                        if (queue.Count == 0)
                            break;
                    }
                    item = queue.Dequeue ();
                } yield return item;
            } while (! shutDown);
    }
}


 public IEnumerable < T > DequeueAll () {
    while (! shutDown) {
        int count;
        lock (queue) {
            count = queue.Count;
            if (count == 0) {
                if (shutDown)
                    break;
                Monitor.Wait (queue);
                count = queue.Count;
                if (count == 0)
                    break;
            }
        }
        for (int i = 0; i < count; i++) {
            T item;
            lock (queue) {
                item = queue.Dequeue ();
            }
            yield return item;
        }
    }
}


