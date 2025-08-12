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



private void dataGridView1_CellContentClick (object sender, DataGridViewCellEventArgs e) {
    if (e.ColumnIndex == dataGridView1.Columns ["Gender"].Index) {
        dataGridView1.EndEdit ();
        if ((bool) dataGridView1.Rows [e.RowIndex].Cells ["Gender"].Value) {
            dataGridView1.Rows [e.RowIndex].Cells [e.ColumnIndex].ReadOnly = true;
        }
    }
}


