private void dataGridDetail_EditingControlShowing (object sender, DataGridViewEditingControlShowingEventArgs e) {
    if (dataGridDetail.EditingControl.GetType () == typeof (DataGridViewTextBoxEditingControl)) {
        TextBox prodCode = e.Control as TextBox;
        if (dataGridDetail.CurrentCell.ColumnIndex == 2) {
            var source = new AutoCompleteStringCollection ();
            String [] stringArray = Array.ConvertAll < DataRow, String > (products.Select (), delegate (DataRow row) {
                return (String) row ["code"];
            });
            source.AddRange (stringArray);
            TextBox prodCode = e.Control as TextBox;
            if (prodCode != null) {
                prodCode.AutoCompleteMode = AutoCompleteMode.SuggestAppend;
                prodCode.AutoCompleteCustomSource = source;
                prodCode.AutoCompleteSource = AutoCompleteSource.CustomSource;
            }
        } else {
            prodCode.AutoCompleteCustomSource = null;
        }
    }
}


  private void dataGridDetail_EditingControlShowing (object sender, DataGridViewEditingControlShowingEventArgs e) { 
    if(dataGridDetail.EditingControl.GetType () == typeof (DataGridViewTextBoxEditingControl)){ 
        TextBox prodCode = e.Control as TextBox; 
        if (dataGridDetail.CurrentCell.ColumnIndex == 2) { 
            var source = new AutoCompleteStringCollection(); 
            Array dataRowArray = products.Select();
            foreach(DataRow row in dataRowArray){ 
                source.Add((String)row["code"]); 
            } 
             TextBox prodCode = e.Control as TextBox; 
            if (prodCode != null) { 
                prodCode.AutoCompleteMode = AutoCompleteMode.SuggestAppend; 
                prodCode.AutoCompleteCustomSource = source; 
                prodCode.AutoCompleteSource = AutoCompleteSource.CustomSource; 
            } 
        } 
        else { 
            prodCode.AutoCompleteCustomSource = null; 
        } 
    } 
}


