public static DataTable ImportExcelXML (string Filename) {
    DataSet DS = new DataSet ();
    DS.ReadXml (Filename);
    DataTable Raw = new DataTable ();
    Raw = DS.Tables ["Data"];
    int ColumnNumber = Raw.Columns.Count;
    DataTable ImportData = new DataTable ();
    List < string > RowData = new List < string > ();
    for (int Counter = 0; Counter < Raw.Rows.Count; Counter ++) {
        if (Counter < ColumnNumber) {
            ImportData.Columns.Add (Raw.Rows [Counter].ItemArray.GetValue (1).ToString ());
        } else {
            if ((Counter % ColumnNumber == 0) && (Counter != ColumnNumber)) {
                ImportData.Rows.Add (GenerateRow (ImportData, RowData));
                RowData.Clear ();
            }
            RowData.Add (Raw.Rows [Counter].ItemArray.GetValue (1).ToString ());
        }
    }
    ImportData.Rows.Add (GenerateRow (ImportData, RowData));
    return ImportData;
}


 public static DataTable GetXMLFile(string Filename) 
{ 
    DataSet ds = new DataSet(Filename); 
    ds.ReadXml(Filename); 
    DataTable Data = new DataTable(); 
    Data = ds.Tables["Data"]; 
    int ColAmount = Data.Columns.Count; 
    DataTable LoadedData = new DataTable(); 
    List<string> Records = new List<string>(); 

    for (int i = 0; i < Data.Rows.Count; i++) 
    { 
        if (i < ColAmount) { 
            LoadedData.Columns.Add(Data.Rows[i].ItemArray.GetValue(1).ToString()); 
        } 
        else { 
            if ((i % ColAmount == 0) && (i != ColAmount)){ 
                LoadedData.Rows.Add(GenerateRow(LoadedData, Records)); 
                Records.Clear(); 
            } 
            Records.Add(Data.Rows[i].ItemArray.GetValue(1).ToString()); 
        } 
    } 
    LoadedData.Rows.Add(GenerateRow(LoadedData, Records)); 
    return LoadedData; 
}
