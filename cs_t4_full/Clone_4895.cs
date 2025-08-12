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
        if (!this.locks.ContainsKey(key))
        {
            this.locks[key] = new Locker(this, key);
        }
    }
 
    while(this.locks[key].WaitCount > 0) { /* Spin wait... */ }
    Monitor.Enter(this.globalLock);
 
    return this.locks[key];
}


