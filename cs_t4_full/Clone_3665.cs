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
        if (Monitor.TryEnter(queue, TimeSpan.FromMilliseconds(5000)))
        {
            if (queue.Count > 0)
            {
                yield return queue.Dequeue();
            }
            Monitor.Exit(queue);
        }
    }
}


