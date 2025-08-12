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
    bool notGettingItem = true;

    while (notGettingItem) {
        lock (this) {
            if (this.pool.Count > 0) {
                item = this.pool.Dequeue();
                notGettingItem = false;
            }
            else if (this.currentSize < this.maxSize) {
                item = this.constructor();
                this.currentSize++;
                notGettingItem = false;
            }
        }
        if (notGettingItem) {
            this.poolReleasedEvent.WaitOne();
        }
    }

    return item;
}


