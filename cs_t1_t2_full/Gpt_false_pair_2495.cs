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


 public static DataTable GetExcelXMLData(string filename) 
{ 
    DataSet ds = new DataSet(filename); 
    ds.ReadXml(filename); 
    DataTable DataFile = new DataTable(); 
    DataFile = ds.Tables["Data"]; 
    int columnNumber = DataFile.Columns.Count; 
    DataTable ImporterData = new DataTable(); 
    List<string> rowData = new List<string>(); 

    for (int index = 0; index < DataFile.Rows.Count; index++) 
    { 
        if (index < columnNumber) { 
            ImporterData.Columns.Add(DataFile.Rows[index].ItemArray.GetValue(1).ToString()); 
        } 
        else { 
            if ((index % columnNumber == 0) && (index != columnNumber)){ 
                ImporterData.Rows.Add(GenerateRow(ImporterData, rowData)); 
                rowData.Clear(); 
            } 
            rowData.Add(DataFile.Rows[index].ItemArray.GetValue(1).ToString()); 
        } 
    } 
    ImporterData.Rows.Add(GenerateRow(ImporterData, rowData)); 
    return ImporterData; 
}
