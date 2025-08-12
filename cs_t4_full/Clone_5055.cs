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
    while (! shutdown) {
        T item;
        lock (queue)
        {
            if (queue.Count > 0)
            {
                item = queue.Dequeue ();
            }
            else
            {
                break;
            }
        }
        yield return item;
    }
}


