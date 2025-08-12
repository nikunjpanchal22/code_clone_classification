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


 public T GetFromPool()
{
    T item = null;
    bool itemRetrieved = false;

    while (!itemRetrieved)
    {   
        lock(this)
        {
            if (this.pool.Count > 0)
            {
                item = pool.Dequeue();
                itemRetrieved = true;
            }
            else if (this.currentSize < this.maxSize)
            {
                item = constructor();
                this.currentSize++;
                itemRetrieved = true;
            }
        }
        if (!itemRetrieved)
        {
            this.poolReleasedEvent.WaitOne();
        }
    }
    return item;
}


