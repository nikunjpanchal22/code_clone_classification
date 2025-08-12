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


#====================
#gpt output=============
    //Type 3  
public static void ProcessCsv () {
    var filename = @"your_file_path\filename.csv";
    DataTable dt = new DataTable ("MyTable");
    List < string > product_codes = new List < string > ();
    using (CsvReader csv = new CsvReader (new StreamReader (filename), true))
    {
        int fieldCount = csv.FieldCount; 
        dt.Columns.AddRange (csv.GetFieldHeaders ().Select (name => new DataColumn (name)).ToArray ());
        while (csv.ReadNextRecord ()) { 
            DataRow dr = dt.NewRow ();
            for (int i = 0; i < fieldCount; i ++) { 
                product_codes.Add (csv [i]);
                dr [i] = csv [i];
            }
            dt.Rows.Add (dr);
        }
    }}

//Type 4 
public static void ProcessCsv () {
    var filename = @"your_file_path\filename.csv";
    DataTable dt = new DataTable ("MyTable");
    List < string > product_codes = new List < string > ();
    using (CsvReader csv = new CsvReader (new StreamReader (filename), true))
    { 
        Dictionary<string, int> fieldIndicesByName = new Dictionary<string, int> ();
        for (int i = 0; i < csv.FieldCount; i ++) { 
            fieldIndicesByName.Add (csv.GetFieldHeader (i), i);
            dt.Columns.Add (csv.GetFieldHeader (i));
        }

        while (csv.ReadNextRecord ()) { 
            DataRow dr = dt.NewRow ();
            for (int i = 0; i < fieldIndicesByName.Count; i ++) { 
                product_codes.Add (csv [fieldIndicesByName [headers [i]]]);
                dr [i] = csv [fieldIndicesByName [headers [i]]];
            }
            dt.Rows.Add (dr);
        }
    }}


// Type 3
public static void ProcessCsv()
{
    var filename = @"your_file_path\filename.csv";
    DataTable dt = new DataTable("MyTable");
    List<string> product_codes = new List<string>();
    using (CsvReader csv = new CsvReader(new StreamReader(filename), true))
    {
        int fieldCount = csv.FieldCount;
        string[] headers = csv.GetFieldHeaders();
        foreach (string header in headers)
        {
            dt.Columns.Add(header, typeof(string));
        }
        while (csv.ReadNextRecord())
        {
            DataRow dr = dt.NewRow();
            for (int i = 0; i < fieldCount; i++)
            {
                product_codes.Add(csv[i]);
                dr[i] = csv[i];
            }
            dt.Rows.Add(dr);
        }
    }
}


public static void ProcessCsv () {
    var filename = @"your_file_path\filename.csv";
    DataTable dt = new DataTable ("MyTable");
    List < string > product_codes = new List < string > ();
    using (CsvReader csv = new CsvReader (new StreamReader (filename), true))
    {
        int fieldCount = csv.FieldCount; 
        dt.Columns.AddRange (csv.GetFieldHeaders ().Select (name => new DataColumn (name)).ToArray ());
        while (csv.ReadNextRecord ()) { 
            DataRow dr = dt.NewRow ();
            for (int i = 0; i < fieldCount; i ++) { 
                product_codes.Add (csv [i]);
                dr [i] = csv [i];
            }
            dt.Rows.Add (dr);
        }
    }}

//Type 4 
public static void ProcessCsv () {
    var filename = @"your_file_path\filename.csv";
    DataTable dt = new DataTable ("MyTable");
    List < string > product_codes = new List < string > ();
    using (CsvReader csv = new CsvReader (new StreamReader (filename), true))
    { 
        Dictionary<string, int> fieldIndicesByName = new Dictionary<string, int> ();
        for (int i = 0; i < csv.FieldCount; i ++) { 
            fieldIndicesByName.Add (csv.GetFieldHeader (i), i);
            dt.Columns.Add (csv.GetFieldHeader (i));
        }

        while (csv.ReadNextRecord ()) { 
            DataRow dr = dt.NewRow ();
            for (int i = 0; i < fieldIndicesByName.Count; i ++) { 
                product_codes.Add (csv [fieldIndicesByName [headers [i]]]);
                dr [i] = csv [fieldIndicesByName [headers [i]]];
            }
            dt.Rows.Add (dr);
        }
    }}


// Type 3
public static void ProcessCsv()
{
    var filename = @"your_file_path\filename.csv";
    DataTable dt = new DataTable("MyTable");
    List<string> product_codes = new List<string>();
    using (CsvReader csv = new CsvReader(new StreamReader(filename), true))
    {
        int fieldCount = csv.FieldCount;
        string[] headers = csv.GetFieldHeaders();
        foreach (string header in headers)
        {
            dt.Columns.Add(header, typeof(string));
        }
        while (csv.ReadNextRecord())
        {
            DataRow dr = dt.NewRow();
            for (int i = 0; i < fieldCount; i++)
            {
                product_codes.Add(csv[i]);
                dr[i] = csv[i];
            }
            dt.Rows.Add(dr);
        }
    }
}
