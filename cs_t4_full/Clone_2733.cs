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
		if (row.IsNull("DataDesc")) continue;
		string description = row["DataDesc"].ToString();
		description = description.Contains("STATE") ? description.Replace("STATE", "") : description;
		description = description.Contains("HELLO ALL") ? description.Replace("HELLO ALL", "") : description;
		if (description.Contains("(")) description = description.Substring(0, description.IndexOf("("));
		row["DataDesc"] = description.Trim();
	    }
}


