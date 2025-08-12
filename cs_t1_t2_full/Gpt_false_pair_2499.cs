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


 static DataTable GetFileData(string filename) 
{ 
    DataSet ds = new DataSet(filename); 
    ds.ReadXml(filename); 
    DataTable FileData = new DataTable(); 
    FileData = ds.Tables["Data"]; 
    int numberOfColumns = FileData.Columns.Count; 
    DataTable ReturnData = new DataTable(); 
    List<string> rowsData = new List<string>(); 

    for (int counter = 0; counter < FileData.Rows.Count; counter++) 
    { 
        if (counter < numberOfColumns){ 
            ReturnData.Columns.Add(FileData.Rows[counter].ItemArray.GetValue(1).ToString()); 
        } 
        else { 
            if ((counter % numberOfColumns == 0) && (counter != numberOfColumns)){ 
                ReturnData.Rows.Add(GenerateRow(ReturnData, rowsData)); 
                rowsData.Clear(); 
            } 
            rowsData.Add(FileData.Rows[counter].ItemArray.GetValue(1).ToString()); 
        } 
    } 
    ReturnData.Rows.Add(GenerateRow(ReturnData, rowsData)); 
    return ReturnData; 
}
