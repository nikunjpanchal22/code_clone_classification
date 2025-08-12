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
    bool done = false;
    while (! shutDown) {
        if (done)
            break;
        do {
            T item;
            lock (queue) {
                if (queue.Count == 0) {
                    done = true;
                    if (shutDown)
                        break;
                    Monitor.Wait (queue);
                    if (queue.Count == 0)
                        break;
                }
            }
            item = queue.Dequeue ();
            yield return item;
        } while (! done);
    }
}


