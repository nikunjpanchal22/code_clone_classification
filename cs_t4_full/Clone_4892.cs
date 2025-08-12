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
    Locker locker = new Locker(this,key);
    bool created = false;
    lock (this.globalLock) 
    {
        if (!this.locks.ContainsKey(key))
        {
            this.locks[key] = locker;
            created = true;
        }
    }
    if (created)
    {
        locker.Enter();
    }
    else
    {
        locker = this.locks[key];
        locker.WaitCount++;
        locker.Enter();
        locker.WaitCount--;
    }
    return locker;
}


