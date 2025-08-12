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





public IEnumerable<T> DequeueAll()
{
    while (!shutDown)
    {
        T item = default(T);
        bool lockTaken = false;
        try
        {
            Monitor.TryEnter(queue, ref lockTaken);
            if (queue.Count > 0)
            {
                item = queue.Dequeue();
            }
        }
        finally
        {
            if (lockTaken)
            {
                Monitor.Exit(queue);
            }
        }
        if (item != null)
        {
            yield return item;
        }
    }
}


