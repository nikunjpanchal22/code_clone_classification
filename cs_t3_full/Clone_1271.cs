public static void ProcessCsv () {
    var filename = @"your_file_path\filename.csv";
    DataTable dt = new DataTable ("MyTable");
    List < string > product_codes = new List < string > ();
    using (CsvReader csv = new CsvReader (new StreamReader (filename), true))
    {
        int fieldCount = csv.FieldCount;
        string [] headers = csv.GetFieldHeaders ();
        for (int i = 0; i < headers.Length; i ++) {
            dt.Columns.Add (headers [i], typeof (string));
        }
        while (csv.ReadNextRecord ()) {
            DataRow dr = dt.NewRow ();
            for (int i = 0; i < fieldCount; i ++) {
                product_codes.Add (csv [i]);
                dr [i] = csv [i];
            }
            dt.Rows.Add (dr);
        }
    }
}


 public static void ProcessCsv () {
    var filename = @"your_file_path\filename.csv";
    DataTable dt = new DataTable ("MyTable");
    List < string > product_codes = new List < string > ();
    StreamReader file = new StreamReader (filename);
    CsvReader csv = new CsvReader (file, true);
    while (csv.ReadNextRecord ()) {
        DataRow dr = dt.NewRow ();
        for (int i = 0; i < csv.FieldCount; i ++) {
            product_codes.Add (csv [i]);
            dr [i] = csv [i];
            dt.Columns.Add (csv.GetFieldHeaders () [i], typeof (string));
        }
        dt.Rows.Add (dr);
    }
}


