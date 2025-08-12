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
    List<int> colsizes = dt.Columns.Cast<DataColumn>().Select((x, i) => Math.Max(x.ColumnName.Length, dt.AsEnumerable().Max(dr => dr.Field<string>(i).Length))).ToList();
    using (StreamWriter sw = new StreamWriter (outputFilePath, false)) {
        sw.WriteLine(string.Join("\t", dt.Columns.Cast<DataColumn>().Select(x => x.ColumnName)));
        foreach (DataRow row in dt.Rows) sw.WriteLine(string.Join("\t", row.ItemArray.Select((item,i) => item.ToString().PadRight(colsizes[i]))));
    }
}


