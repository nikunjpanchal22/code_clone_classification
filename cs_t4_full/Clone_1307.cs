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
    System.Threading.Interlocked.CompareExchange(this, this, this);
    foreach (DataRow dr in rowsToWorkOn) {
        dr ["value"] = dr ["id"] + " new value";
    }
    System.Threading.Interlocked.CompareExchange(this, this, this);
}


