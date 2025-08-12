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
    SpinLock sl = new SpinLock ();
    bool gotLock = false;
    try {
        foreach (DataRow dr in rowsToWorkOn) {
            sl.Enter (ref gotLock);
            try {
                dr ["value"] = dr ["id"] + " new value";
            }
            finally {
                if (gotLock) {
                    sl.Exit ();
                }
            }
        }
    }
    finally {
        if (gotLock) {
            sl.Exit ();
        }
    }
}


