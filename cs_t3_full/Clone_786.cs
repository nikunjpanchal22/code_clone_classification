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
                var array2 = row2.ItemArray;
                if (array1.Intersect(array2).Count() == array1.Length) {
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
                var array2 = row2.ItemArray;
                int count = 0;
                for (int i = 0; i < array1.Length; i++) {
                    if(array1[i].Equals(array2[i])) {
                        count++;
                    }
                }
                
                if (array1.Length == count) {
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
                var array2 = row2.ItemArray;
                int count = 0;

                for (int i = 0; i < array1.Length; i++) {
                    if(array1[i] == (int)array2[i] || array1[i].Equals(array2[i]) ) {
                        count++;
                    }
                }
                
                if (array1.Length == count) {
                    isModified = false;
                }
            }
            if (isModified)
                row1.SetModified ();
        }
    } 

  static void CompareRows (DataTable original, DataTable modified) {
    foreach (DataRow modifiedRow in modified.Rows) {
        bool isModified = true;
        List<Object> dataDifferences = modifiedRow.ItemArray.ToList();
        foreach (DataRow originalRow in original.Rows) {
            List<Object> dataOriginals = originalRow.ItemArray.ToList();
            dataDifferences    = dataDifferences.Except(dataOriginals).ToList();
            if (dataDifferences.Count == 0) {
                isModified = false;
            }
        }
        if (isModified)
            modifiedRow.SetModified();
    }
} 


