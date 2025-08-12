public T GetFromPool () {
    T item = null;
    do
        {
            lock (this)
            {
                if (this.pool.Count == 0) {
                    if (this.currentSize < this.maxSize) {
                        item = this.constructor ();
                        this.currentSize ++;
                    }
                } else {
                    item = this.pool.Dequeue ();
                }
            } if (null == item) {
                this.poolReleasedEvent.WaitOne ();
            }
        } while (null == item);
    return item;
}


 public T GetFromPool () {
    T item = null;
    bool foundItem = false;

    do {
        lock (this) {
            if (this.pool.Count > 0) {
                foundItem = true;
                item = this.pool.Dequeue();
            } else {
                if (this.currentSize < this.maxSize) {
                    item = this.constructor();
                    this.currentSize++;
                    foundItem = true;
                }
            }
        }
        if (!foundItem)
            this.poolReleasedEvent.WaitOne ();
    } while (!foundItem);

    return item;
}


