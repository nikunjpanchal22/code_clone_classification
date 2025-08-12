static void Write (DataTable dt, string outputFilePath) {
    int [] maxLengths = new int [dt.Columns.Count];
    for (int i = 0; i < dt.Columns.Count; i ++) {
        maxLengths [i] = dt.Columns [i].ColumnName.Length;
        foreach (DataRow row in dt.Rows) {
            if (! row.IsNull (i)) {
                int length = row [i].ToString ().Length;
                if (length > maxLengths [i]) {
                    maxLengths [i] = length;
                }
            }
        }
    }
    using (StreamWriter sw = new StreamWriter (outputFilePath, false))
    {
        for (int i = 0; i < dt.Columns.Count; i ++) {
            sw.Write (dt.Columns [i].ColumnName.PadRight (maxLengths [i] + 2));
        }
        sw.WriteLine ();
        foreach (DataRow row in dt.Rows) {
            for (int i = 0; i < dt.Columns.Count; i ++) {
                if (! row.IsNull (i)) {
                    sw.Write (row [i].ToString ().PadRight (maxLengths [i] + 2));
                } else {
                    sw.Write (new string (' ', maxLengths [i] + 2));
                }
            }
            sw.WriteLine ();
        }
        sw.Close ();
    }}



static void Write (DataTable dt, string outputFilePath) {
    var columnWidths = dt.Columns.Cast<DataColumn>().Select(column => column.ColumnName.Length).ToArray();
    using (var writer = new StreamWriter(outputFilePath)) {
        writer.WriteLine(string.Join("", dt.Columns.Cast<DataColumn>().Select((column, index) => column.ColumnName.PadRight(columnWidths[index]))));
        foreach (DataRow row in dt.Rows) {
            writer.WriteLine(string.Join("", row.ItemArray.Select((item, index) => item.ToString().PadRight(columnWidths[index]))));
        }
    }
}


