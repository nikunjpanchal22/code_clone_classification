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


 public IDisposable Enter (string key) 
{
    lock (this.globalLock)
    {
        Locker locker;
        if (!this.locks.TryGetValue(key, out locker))
        {
            this.locks[key] = locker = new Locker(this, key);
        }
        lock (locker.LockerObject)
        {
            if (locker.WaitCount == 0) 
            {
                locker.Enter();
            }
            else 
            {
                locker.WaitCount++;
            }
        }
    }
    return locker;
}


