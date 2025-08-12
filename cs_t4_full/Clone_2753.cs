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
    var maxLengths = dt.Columns.OfType<DataColumn>().Select((c,i) => new {i, 
        MaxLength = dt.AsEnumerable().Max(r => r.IsNull(i) ? 0 : r[i].ToString().Length)}).ToArray();
    using (System.IO.StreamWriter sw = new System.IO.StreamWriter (outputFilePath, false)) {
        foreach (var ml in maxLengths) {
            sw.Write (dt.Columns [ml.i].ColumnName.PadRight (ml.MaxLength + 2));
        }
        sw.WriteLine ();
        foreach (DataRow row in dt.Rows) {
            foreach (var ml in maxLengths) {
                sw.Write ((row.IsNull(ml.i) ? "" : row[ml.i].ToString()).PadRight (ml.MaxLength + 2));
            }
            sw.WriteLine ();
        }
    }
}


