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





public boolean add(P producer, E item) {
    lock.lock();
    try {
        queues.merge(producer, new PriorityBlockingQueue<>(Collections.singletonList(item)), (q, nq) -> {
            q.add(item);
            return q;
        });
        added.signalAll();
        return true;
    } finally {
        lock.unlock();
    }
}


