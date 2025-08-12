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


  public async void DoWorkUpdatingRow (object state) {
    List < DataRow > rowsToWorkOn = (List < DataRow >) state;
    await Task.Run (() => {
        foreach (DataRow dr in rowsToWorkOn) {
            Monitor.Enter (this);
            try {
                dr ["value"] = dr ["id"] + " new value";
            }
            finally {
                Monitor.Exit (this);
            }
        }
    });
}


