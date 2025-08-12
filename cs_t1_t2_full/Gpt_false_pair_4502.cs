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
        var array1 = row1.ItemArray;
        foreach (DataRow row2 in original.Rows) {
            if (!array1.Except (row2.ItemArray).Any ()) {
                isModified = false;
            }
        }
        if (isModified)
            row1.SetModified ();
    }
}
