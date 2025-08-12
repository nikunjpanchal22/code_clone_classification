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
    String[] headers = null;
    List < string > product_codes = new List < string > ();
    using (CsvReader csv = new CsvReader (new StreamReader (filename), true))
    {
        while (csv.ReadNextRecord ()) {
            DataRow dr = dt.NewRow ();
            if (headers == null) {
                headers = csv.GetFieldHeaders ();
                foreach (string header in headers)
                    dt.Columns.Add (header, typeof (string));
            }
            for (int i = 0; i < headers.Length; i ++) {
                product_codes.Add (csv [i]);
                dr [i] = csv [i];
            }
            dt.Rows.Add (dr);
        }
    }
}


