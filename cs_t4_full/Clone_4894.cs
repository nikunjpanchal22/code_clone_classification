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
    Locker locker;
    string lockKey = GetLockKey(key);
    if (!Locks.TryGetValue(lockKey, out locker))
    {
        Locks.TryAdd(lockKey, locker = new Locker(this, key));
    }
    locker.WaitCount++;
    lock(GlobalLocker.GetLock(lockKey))
    {
        locker.Enter();
        locker.WaitCount--;
    }
    return locker;
}


