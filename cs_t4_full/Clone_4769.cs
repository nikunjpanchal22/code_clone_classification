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
    SpinLock sl = new SpinLock();
    Parallel.ForEach(rowsToWorkOn, rowToWorkOn =>
    {
        bool lockTaken = false;
        try
        {
            sl.Enter(ref lockTaken);
            rowToWorkOn["value"] = rowToWorkOn["id"] + " new value";
        }
        finally
        {
            if (lockTaken)
            {
                sl.Exit();
            }
        }
    });
}


