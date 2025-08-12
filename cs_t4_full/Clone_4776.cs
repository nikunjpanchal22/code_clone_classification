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


 public void DoWorkUpdatingRow (List<DataRow> rowsToWorkOn)
{
    Interlocked.CompareExchange(ref this, null, null);
    foreach (DataRow dr in rowsToWorkOn)
    {
        dr["value"] = dr["id"] + " new value";
    }
    Interlocked.Exchange(ref this, null);
}


