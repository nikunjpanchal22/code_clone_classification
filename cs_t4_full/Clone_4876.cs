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


 public T GetFromPool () 
{
    T item;
	bool canGetItem = false;

    do
    {
        lock (this) 
        {
            if (this.pool.Count > 0) 
		    {
                item = this.pool.Dequeue();
				canGetItem = true;
            }
            else if (this.currentSize < this.maxSize) 
		    {
                item = this.constructor();
                this.currentSize++;
				canGetItem = true;
            }
        }
        if (!canGetItem) 
		{
            this.poolReleasedEvent.WaitOne();
        }
    } while (!canGetItem);

    return item;
}


