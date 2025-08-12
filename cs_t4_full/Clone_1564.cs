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
    Locker locker = new Locker (this, key);
    lock (this.globalLock) {
        this.locks.Add(key, locker);
    }
    locker.Enter ();
    return locker;
}


