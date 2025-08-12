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


 public void DoWorkUpdatingRow(object state) 
{ 
    List<DataRow> rowsToWorkOn = (List<DataRow>)state; 
    List<Task> tasks = new List<Task>(); 

    foreach (DataRow dr in rowsToWorkOn) 
    { 
        tasks.Add(Task.Run(() => {
            Monitor.Enter(this); 
            try 
            { 
                dr["value"] = dr["id"] + " new value"; 
            } 
            finally 
            { 
                Monitor.Exit(this); 
            } 
        })); 
    } 

    Task.WaitAll(tasks.ToArray()); 
} 


