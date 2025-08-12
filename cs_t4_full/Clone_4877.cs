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
    bool canContinue = true;

    while (canContinue)
    {
        lock (this)
        {
            if(pool.Count > 0)
            {
                item = pool.Dequeue();
                canContinue = false;
            }
            else if(currentSize < maxSize)
            {
               item = constructor();
               currentSize++;
               canContinue = false;
            }
        }
        if (canContinue)
        {
            poolReleasedEvent.WaitOne();
        }
    }
    return item;
}


