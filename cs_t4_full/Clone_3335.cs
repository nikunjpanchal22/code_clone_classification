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
    }}




public static void ProcessCsv()
{
    var filename = @"your_file_path\filename.csv";
    var dt = new DataTable("MyTable");
    var product_codes = new List<string>();

    using (var csv = new CsvReader(new StreamReader(filename), true))
    {
        var fieldHeaders = csv.GetFieldHeaders();

        foreach (var header in fieldHeaders)
        {
            dt.Columns.Add(header, typeof(string));
        }

        while (csv.ReadNextRecord())
        {
            var row = dt.NewRow();
            fieldHeaders.Select((t, i) => row[i] = csv[i]).ToList();
            product_codes.AddRange(fieldHeaders.Select((t, i) => csv[i]));
            dt.Rows.Add(row);
        }
    }
}


