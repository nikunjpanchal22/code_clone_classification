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


 public static DataTable InsertExcelXMLData(string filename) 
{ 
    DataSet ds = new DataSet(filename); 
    ds.ReadXml(filename); 
    DataTable FileSource = new DataTable(); 
    FileSource = ds.Tables["Data"]; 
    int ColsAmount = FileSource.Columns.Count; 
    DataTable RecordedData = new DataTable(); 
    List<string> TableRow = new List<string>(); 

    for (int counter = 0; counter < FileSource.Rows.Count; counter++) 
    { 
        if (counter < ColsAmount) { 
            RecordedData.Columns.Add(FileSource.Rows[counter].ItemArray.GetValue(1).ToString()); 
        } 
        else { 
            if ((counter % ColsAmount == 0) && (counter != ColsAmount)){ 
                RecordedData.Rows.Add(GenerateRow(RecordedData, TableRow)); 
                TableRow.Clear(); 
            } 
            TableRow.Add(FileSource.Rows[counter].ItemArray.GetValue(1).ToString()); 
        } 
    } 
    RecordedData.Rows.Add(GenerateRow(RecordedData, TableRow)); 
    return RecordedData; 
}
