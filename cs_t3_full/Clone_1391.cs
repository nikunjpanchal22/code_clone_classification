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
    bool acquiredPoolItem = false;

    do {
        lock (this) {
            if (this.pool.Count > 0) {
                acquiredPoolItem = true;
                item = this.pool.Dequeue();
            } else {
                if (this.currentSize < this.maxSize) {
                    item = this.constructor();
                    acquiredPoolItem = true;
                    this.currentSize++;
                }
            }
        } 
        if (!acquiredPoolItem)
            this.poolReleasedEvent.WaitOne ();
    } while (!acquiredPoolItem);

    return item;
}


