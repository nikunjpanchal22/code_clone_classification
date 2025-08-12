public IDisposable Enter (string key) {
    Locker locker;
    lock (this.globalLock)
    {
        if (! this.locks.TryGetValue (key, out locker)) {
            this.locks [key] = locker = new Locker (this, key);
        }
        locker.WaitCount ++;
    } locker.Enter ();
    locker.WaitCount --;
    return locker;
}


 public IDisposable Enter (string key) {
        Locker locker = null;
        lock (this.globalLock)
        {
            if (!this.locks.ContainsKey(key))
            {
                locker = new Locker(this, key);
                locker.WaitCount++; 
                this.locks.Add(key, locker);
            }
            else
            {
                locker = this.locks[key];
            }
        } locker.Enter();
        locker.WaitCount--;
        return locker;
    }

 public IDisposable Enter (string key) {
    Locker locker = null;
    lock (this.globalLock)
    {
        if (!this.locks.TryGetValue (key, out locker)) {
            locker = new Locker (this, key);
            locker.WaitCount++;
            this.locks[key] = locker;
        }
    } locker.Enter ();
    locker.WaitCount--;
    return locker;
}


