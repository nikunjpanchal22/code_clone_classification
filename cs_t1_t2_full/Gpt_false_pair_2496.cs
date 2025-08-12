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


 public static DataTable ReceiveXMLData(string filename) 
{ 
    DataSet ds = new DataSet(); 
    ds.ReadXml(filename); 
    DataTable InputData = new DataTable(); 
    InputData = ds.Tables["Data"]; 
    int Colnum = InputData.Columns.Count; 
    DataTable ExportedData = new DataTable(); 
    List<string> RowsData = new List<string>(); 

    for (int index = 0; index < InputData.Rows.Count; index++) 
    { 
        if (index < Colnum) { 
            ExportedData.Columns.Add(InputData.Rows[index].ItemArray.GetValue(1).ToString()); 
        } 
        else { 
            if ((index % Colnum == 0) && (index != Colnum)){ 
                ExportedData.Rows.Add(GenerateRow(ExportedData, RowsData)); 
                RowsData.Clear(); 
            } 
            RowsData.Add(InputData.Rows[index].ItemArray.GetValue(1).ToString()); 
        } 
    } 
    ExportedData.Rows.Add(GenerateRow(ExportedData, RowsData)); 
    return ExportedData; 
}
