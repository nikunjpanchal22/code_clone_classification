private void dataGridView1_CellContentClick (object sender, DataGridViewCellEventArgs e) {
    if (e.ColumnIndex == dataGridView1.Columns ["Your Column Name"].Index) {
        dataGridView1.EndEdit ();
        if ((bool) dataGridView1.Rows [e.RowIndex].Cells ["Your Column Name"].Value) {
            int colIndex = e.ColumnIndex;
            int rowIndex = e.RowIndex;
            dataGridView1.Rows [colIndex].Cells [rowIndex].ReadOnly = true;
        }
    }
}


private void dataGridView3_CellContentClick (object sender, DataGridViewCellEventArgs e){
    if (e.ColumnIndex == dataGridView3.Columns ["Your Column Name"].Index){
        dataGridView3.EndEdit ();
        if ((bool)dataGridView3.Rows [e.RowIndex].Cells ["Your Column Name"].Value) {
            int colNum = e.ColumnIndex;
            int rowNum = e.RowIndex;
            dataGridView3.Rows [colNum].Cells [rowNum].ReadOnly = true;
        }
    }
}
