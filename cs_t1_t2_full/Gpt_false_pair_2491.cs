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


 public static DataTable LoadExcelXML (string Filename) 
{ 
    DataSet ds = new DataSet(Filename); 
    ds.ReadXml(Filename); 
    DataTable RawCollection = new DataTable(); 
    RawCollection = ds.Tables["Data"]; 
    int AmountOfColumns = RawCollection.Columns.Count; 
    DataTable ImportedCol = new DataTable(); 
    List<string> Rows = new List<string>(); 

    for (int i = 0; i < RawCollection.Rows.Count; i++) 
    { 
        if (i < AmountOfColumns) { 
            ImportedCol.Columns.Add(RawCollection.Rows[i].ItemArray.GetValue(1).ToString()); 
        } 
        else { 
            if ((i % AmountOfColumns == 0) && (i != AmountOfColumns)){ 
                ImportedCol.Rows.Add(GenerateRow(ImportedCol, Rows)); 
                Rows.Clear(); 
            } 
            Rows.Add(RawCollection.Rows[i].ItemArray.GetValue(1).ToString()); 
        } 
    } 
    ImportedCol.Rows.Add(GenerateRow(ImportedCol, Rows)); 
    return ImportedCol; 
}
