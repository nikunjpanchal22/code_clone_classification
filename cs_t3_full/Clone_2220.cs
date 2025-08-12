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
    DataTable dt = new DataTable("MyTable");
    List<string> product_codes = new List<string>();

    using (StreamReader textReader = new StreamReader(filename))
    {
        CsvReader csvReader = new CsvReader(textReader, true);
        dt.Columns.AddRange(csvReader.GetFieldHeaders().Select(column => new DataColumn(column, typeof(string))).ToArray());

        while (csvReader.ReadNextRecord())
        {
            DataRow dataRow = dt.NewRow();
            for (int i = 0; i < csvReader.FieldCount; i++)
            {
                product_codes.Add(csvReader[i]);
                dataRow[i] = csvReader[i];
            }
            dt.Rows.Add(dataRow);
        }
    }
}


