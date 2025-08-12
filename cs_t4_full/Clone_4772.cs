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


 public void DoWorkUpdatingRow(List<DataRow> rowsToWorkOn)
{
    foreach (DataRow dr in rowsToWorkOn)
    {
        Interlocked.Increment(ref this);
        try
        {
            dr["value"] = dr["id"] + " new value";
        }
        finally
        {
            Interlocked.Decrement(ref this);
         }
    }
}


