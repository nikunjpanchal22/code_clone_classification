public boolean add (P producer, E item) {
    lock.lock ();
    try {
        if (! queues.containsKey (producer)) {
            queues.put (producer, new PriorityBlockingQueue < > ());
        }
        added.signalAll ();
        return queues.get (producer).add (item);
    } finally {
        lock.unlock ();
    }
}





public synchronized boolean add (P producer, E item) {
    if (! queues.containsKey (producer)) {
        queues.put (producer, new PriorityBlockingQueue < > ());
    }
    added.signalAll ();
    return queues.get (producer).offer (item);
}


