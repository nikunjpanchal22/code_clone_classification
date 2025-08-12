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


 public static DataTable ExtractExcelXML(string Filename) 
{ 
    DataSet ds = new DataSet(Filename); 
    ds.ReadXml(Filename); 
    DataTable RawData = new DataTable(); 
    RawData = ds.Tables["Data"]; 
    int ColAmount = RawData.Columns.Count; 
    DataTable Export = new DataTable(); 
    List<string> RowsData = new List<string>(); 

    for (int i = 0; i < RawData.Rows.Count; i++) 
    { 
        if (i < ColAmount) { 
         Export.Columns.Add(RawData.Rows[i].ItemArray.GetValue(1).ToString()); 
        } 
        else { 
            if ((i % ColAmount == 0) && (i != ColAmount)){ 
                Export.Rows.Add(GenerateRow(Export, RowsData)); 
                RowsData.Clear(); 
            } 
            RowsData.Add(RawData.Rows[i].ItemArray.GetValue(1).ToString()); 
        } 
    } 
    Export.Rows.Add(GenerateRow(Export, RowsData)); 
    return Export; 
}
