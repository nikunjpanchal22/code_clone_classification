public void DoWorkUpdatingRow (object state) {
    List < DataRow > rowsToWorkOn = (List < DataRow >) state;
    foreach (DataRow dr in rowsToWorkOn) {
        Monitor.Enter (this);
        try {
            dr ["value"] = dr ["id"] + " new value";
        }
        finally {
            Monitor.Exit (this);
        }
    }
}


 public void DoWorkUpdatingRow (object state) {
    List < DataRow > rowsToWorkOn = (List < DataRow >) state;
    ReaderWriterLockSlim rwLock = null;
    try{
        rwLock = new ReaderWriterLockSlim();
        rwLock.EnterWriteLock();
        foreach (DataRow dr in rowsToWorkOn) {
            dr ["value"] = dr ["id"] + " new value";
        }
    }finally{
        if(rwLock != null){
            rwLock.ExitWriteLock();
        }
    }
}


