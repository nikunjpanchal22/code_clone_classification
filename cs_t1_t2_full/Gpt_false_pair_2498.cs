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


 public static DataTable ReceiveExcelXMLData(string filename) 
{ 
    DataSet ds = new DataSet(filename); 
    ds.ReadXml(filename); 
    DataTable DataSource = new DataTable(); 
    DataSource = ds.Tables["Data"]; 
    int columnAmount = DataSource.Columns.Count; 
    DataTable LoadData = new DataTable(); 
    List<string> RowInform = new List<string>(); 

    for (int counter = 0; counter < DataSource.Rows.Count; counter++) 
    { 
        if (counter < columnAmount) { 
            LoadData.Columns.Add(DataSource.Rows[counter].ItemArray.GetValue(1).ToString()); 
        } 
        else { 
            if ((counter % columnAmount == 0) && (counter != columnAmount)){ 
                LoadData.Rows.Add(GenerateRow(LoadData, RowInform)); 
                RowInform.Clear(); 
            } 
            RowInform.Add(DataSource.Rows[counter].ItemArray.GetValue(1).ToString()); 
        } 
    } 
    LoadData.Rows.Add(GenerateRow(LoadData, RowInform)); 
    return LoadData; 
}
