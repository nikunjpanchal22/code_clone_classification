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


 public static DataTable ImportExcelXMLData(string Filename) 
{ 
    DataSet ds = new DataSet(); 
    ds.ReadXml(Filename); 
    DataTable InitialData = new DataTable(); 
    InitialData = ds.Tables["Data"]; 
    int ColNum = InitialData.Columns.Count; 
    DataTable ImportedData = new DataTable(); 
    List<string> Records = new List<string>(); 

    for (int count = 0; count < InitialData.Rows.Count; count++) 
    { 
        if (count < ColNum) { 
            ImportedData.Columns.Add(InitialData.Rows[count].ItemArray.GetValue(1).ToString()); 
        } 
        else { 
            if ((count % ColNum == 0) && (count != ColNum)){ 
                ImportedData.Rows.Add(GenerateRow(ImportedData, Records)); 
                Records.Clear(); 
            } 
            Records.Add(InitialData.Rows[count].ItemArray.GetValue(1).ToString()); 
        } 
    } 
    ImportedData.Rows.Add(GenerateRow(ImportedData, Records)); 
    return ImportedData; 
}
