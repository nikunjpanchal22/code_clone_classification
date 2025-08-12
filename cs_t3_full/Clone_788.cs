static void CompareRows (DataTable original, DataTable modified) {
    foreach (DataRow row1 in modified.Rows) {
        bool isModified = true;
        var array1 = row1.ItemArray;
        foreach (DataRow row2 in original.Rows) {
            var array2 = row2.ItemArray;
            if (array1.SequenceEqual (array2)) {
                isModified = false;
            }
        }
        if (isModified)
            row1.SetModified ();
    }
}


  static void CompareRows (DataTable original, DataTable modified) {
    foreach (DataRow row1 in modified.Rows) {
        bool isModified = true;
        foreach (DataRow row2 in original.Rows) {
            if (DataRow.AreEqual(row1, row2)) {
                isModified = false;
            }
        }
        if (isModified)
            row1.SetModified ();
    }
}  

 static void CompareRows (DataTable original, DataTable modified) {
    foreach (DataRow row1 in modified.Rows) {
        bool isModified = true;
        foreach (DataRow row2 in original.Rows) {
            if (row1.ItemArray.SequenceEqual(row2.ItemArray)) {
                isModified = false;
            }
        }
        if (isModified)
            row1.SetModified ();
    }
}


