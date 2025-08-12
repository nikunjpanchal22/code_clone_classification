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
    Parallel.ForEach(rowsToWorkOn, rowToWorkOn =>
    {
        using (var locker = new LockStore.Locker(this))
        {
            rowToWorkOn["value"] = rowToWorkOn["id"] + " new value";
        }
    });
}


