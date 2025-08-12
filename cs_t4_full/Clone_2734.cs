public void UpdateDescription (DataTable dataTable) {
    if (dataTable != null && dataTable.Rows.Count > 0) {
        foreach (DataRow dr in dataTable.Rows) {
            String dataDesc = dr ["DataDesc"].ToString ();
            if (! dr.IsNull ("DataDesc")) {
                if (dataDesc.Contains ("STATE")) {
                    dataDesc = dataDesc.Replace ("STATE", "").Trim ();
                }
                if (dataDesc.Contains ("HELLO ALL")) {
                    dataDesc = dataDesc.Replace ("HELLO ALL", "").Trim ();
                }
                if (dataDesc.Contains ("(")) {
                    dataDesc = dataDesc.Remove (dataDesc.IndexOf ("(")).Trim ();
                }
            }
            dr ["DataDesc"] = dataDesc;
        }
    }
}


 

public void UpdateDescription(DataTable dataTable)
{
    if (dataTable == null || dataTable.Rows.Count <= 0) return;
    foreach (DataRow row in dataTable.Rows)
    {
        if (!row.IsNull("DataDesc"))
        {
            string dataDesc = row["DataDesc"].ToString().Replace("STATE", "").Replace("HELLO ALL", "");
            int index = dataDesc.IndexOf("(");
            if (index >= 0) dataDesc = dataDesc.Remove(index);
            row["DataDesc"] = dataDesc.Trim();
        }
    }
}


