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





public boolean add (P producer, E item) {
    lock.lock ();
    try {
        added.signalAll ();
        return queues.computeIfAbsent(producer, k -> new PriorityBlockingQueue<>()).add(item);
    } finally {
        lock.unlock ();
    }
}


